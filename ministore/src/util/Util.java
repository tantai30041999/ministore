package util;

public class Util {
   static final String HOST ="http://localhost:8080/ministore/";
   
   public static String getFullPath(String path) {
	   return HOST+path;
   }
}
