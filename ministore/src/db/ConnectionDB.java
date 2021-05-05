package db;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionDB {
    public static ConnectionPool pool;

    public static Connection connect() throws ClassNotFoundException, SQLException, SQLException {
        Connection con = null;
        if (pool == null) {
            pool = BasicConnectionPool.create("jdbc:mysql://localhost:3306/ministore?useUnicode=true&characterEncoding=utf-8", "root", "tantai123");
        }
        con = pool.getConnection();

        return con;
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	connect();

	}
}
