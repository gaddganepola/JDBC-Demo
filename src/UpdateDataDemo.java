import java.sql.*;

public class UpdateDataDemo {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/JDBC_demo";
        String username = "postgres";
        String password = "29997";

        Connection con = DriverManager.getConnection(url, username, password);

        System.out.println("Connection Established");

        Statement stmt = con.createStatement();

        String query = "UPDATE student SET name = 'Nalinda' WHERE id = 1";

        boolean status = stmt.execute(query);

        System.out.println(!status ?"Data updated successfully" : "Error in updating data");

        con.close();

        System.out.println("Connection closed");
    }
}
