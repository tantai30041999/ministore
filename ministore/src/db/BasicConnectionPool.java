package db;


import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class BasicConnectionPool implements ConnectionPool {

	private String url;
	private String user;
	private String password;
	private List<Connection> connectionPool;
	private List<Connection> usedConnections = new ArrayList<>();
	private static int INITIAL_POOL_SIZE = 20;

	public static BasicConnectionPool create(String url, String user, String password)
			throws SQLException, ClassNotFoundException {

		List<Connection> pool = new ArrayList<>(INITIAL_POOL_SIZE);
		for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
			Connection con = createConnection(url, user, password);
			pool.add(con);
		}
		return new BasicConnectionPool(url, user, password, (ArrayList<Connection>) pool);
	}

	// standard constructors
	public BasicConnectionPool(String url, String user, String password, ArrayList<Connection> connectionPool) {
		this.url = url;
		this.user = user;
		this.password = password;
		this.connectionPool = connectionPool;
	}

	@Override
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		if (connectionPool.isEmpty()) {
			if (usedConnections.size() < INITIAL_POOL_SIZE) {
				connectionPool.add(createConnection(url, user, password));
			} else {

				throw new RuntimeException("Maximum pool size reached, no available connections!");
			}
		}
		Connection connection = connectionPool.remove(connectionPool.size() - 1);
		usedConnections.add(connection);
		return connection;
	}

	@Override
	public void releaseConnection(Connection connection) {

		if (usedConnections.remove(connection))
			connectionPool.add(connection);

	}

	private static Connection createConnection(String url, String user, String password)
			throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url, user, password);
	}

	public int getSize() {
		return connectionPool.size() + usedConnections.size();
	}

	@Override
	public int getUsesCon() {
		return usedConnections.size();
	}

	@Override
	public int getNumCon() {
		return connectionPool.size();
	}

	// standard getters
	@Override
	public String getUrl() {
		return url;
	}

	@Override
	public String getUser() {
		return user;
	}

	@Override
	public String getPassword() {
		return password;
	}
}
