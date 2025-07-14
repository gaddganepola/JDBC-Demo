import java.sql.*;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/JDBC_demo";
        String username = "postgres";
        String password = "29997";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        String query = "INSERT INTO student (name, marks) VALUES (?, ?)";

        Connection con = DriverManager.getConnection(url, username, password);

        PreparedStatement pstmt = con.prepareStatement(query);

        pstmt.setString(1, name);
        pstmt.setInt(2, marks);

        pstmt.execute();

        con.close();
    }
}
