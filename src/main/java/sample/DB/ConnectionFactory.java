package sample.DB;

import java.sql.*;

public class ConnectionFactory {

    private static final ConnectionFactory instance = new ConnectionFactory();
    public static final String URL = "jdbc:sqlite:myDB.sqlite";
    public static final String DRIVER_CLASS = "org.sqlite.JDBC";

    private ConnectionFactory(){
        try {
            Class.forName(DRIVER_CLASS);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public Connection createConnection()
    {
        Connection connection;
        try {
           connection = DriverManager.getConnection(URL);
        }
        catch (SQLException ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        }
        return connection;
    }
    public static Connection getConnection(){
        return instance.createConnection();
    }
;}