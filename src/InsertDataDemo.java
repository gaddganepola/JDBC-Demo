import java.sql.*;

public class InsertDataDemo {
    public static void main(String[] args) throws Exception {

        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/JDBC_demo";
        String username = "postgres";
        String password = "29997";

        Connection con = DriverManager.getConnection(url, username, password);

        System.out.println("Connection Established");

        Statement stmt = con.createStatement();

        String query = "INSERT INTO student (name, marks) VALUES ('Malinda', 87)";

        boolean status = stmt.execute(query);

        System.out.println(!status ?"Data added successfully" : "Error in adding data");

        con.close();

        System.out.println("Connection closed");
    }
}
