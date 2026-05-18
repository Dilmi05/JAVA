package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnection {

    static String url ="jdbc:mysql://localhost:3306/student";
    static String username ="root";
    static String password="ama610156";

    public static Connection getconnection(){

        try{
            Connection con = DriverManager.getConnection(url, username, password);
            return con;

        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    public static void main(String args[]){

        Connection con = getconnection();

        if(con != null){
            System.out.println("Database connected successfully");
        }
    }
}