package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQL {
    
    private static Connection connection;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "SaNi20011123$@";
    private static final String DATABASE = "shop";
    
    private static Statement createConnection() throws Exception{
        if(connection == null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+DATABASE,USERNAME,PASSWORD);
        }
        return connection.createStatement();
    }
    
    public static void iud(String query) throws Exception{
        try{
            createConnection().executeUpdate(query);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static ResultSet search(String query) throws Exception{
        return createConnection().executeQuery(query);
    }
    
    public static Connection getConnection(){
        if(connection == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/"+DATABASE,USERNAME,PASSWORD);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static Connection getCon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

