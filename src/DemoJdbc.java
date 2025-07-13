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
        //Second statement
        Statement stmt2;
        try {
            stmt = con.createStatement();
            stmt2 = con.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

//        6.	Execute Statement

        String query = "SELECT * FROM student WHERE id = 1";
        //Query that fetch multiple data
        String query2 = "SELECT * FROM student";

        ResultSet rs;
        ResultSet rs2;
        try {
            rs = stmt.executeQuery(query);
            //Get the result from second query
            rs2 = stmt2.executeQuery(query2);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

//        7.    Process the Result

        try {
            while (rs2.next()) {
                System.out.print(rs2.getString("id") + " - ");
                System.out.print(rs2.getString(2) + " - ");
                System.out.println(rs2.getInt(3));
            }

            //Print using for loop
//            while (rs2.next()) {
//                for (int i = 0; i < rs2.getMetaData().getColumnCount(); i++) {
//                    System.out.print(rs2.getString(i + 1) + " ");
//                }
//                System.out.println();//
//            }

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
