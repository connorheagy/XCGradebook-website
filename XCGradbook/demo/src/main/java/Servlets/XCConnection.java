package Servlets;
import java.sql.*;

public class XCConnection {

    protected static Connection initDB() throws SQLException, ClassNotFoundException {

        String dbDriver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/XCGradeBookBD";
        
        String Username = "postgres";
        String Password = "Control1500#";

        Class.forName(dbDriver);
        Connection con = DriverManager.getConnection(url, Username, Password);

        return con;
    }
} // class XCConnection
