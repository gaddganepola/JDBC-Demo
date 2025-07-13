import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) {

//        1.	Importing the Packages
//        2.	Load the Driver
//        3.	Register Driver

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

//        4.	Create Connection
//        java will be connecting with what, java will be connecting with jdbc
//        jdbc will connect with DBMS
//        mention the database name with IP and Port number

        String url = "jdbc:postgresql://localhost:5432/JDBC_demo";
        String username = "postgres";
        String password = "29997";

        Connection con;
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Connection Established");

//        5.	Create statement

        Statement stmt;
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

//        6.	Execute Statement

        String query = "SELECT * FROM student WHERE id = 1";
        ResultSet rs;
        try {
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

//        7.    Process the Result

        try {
            rs.next();
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString(3));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

//        8.	Close Connection

        try {
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Connection Closed");

    }
}
