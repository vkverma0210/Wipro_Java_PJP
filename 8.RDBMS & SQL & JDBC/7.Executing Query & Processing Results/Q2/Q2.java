import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Q2 {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521/orcl";

        Statement stmt;
        ResultSet rs;
        Connection conn;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        }

        try {
            conn = DriverManager.getConnection(url, "hr", "hr");
            System.out.println("Connection Established Successfully.");

            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM emp WHERE sal > 1000 AND sal < 2000");

            System.out.printf("%-10S%-10S%10S%10S\n", "ename", "job", "sal", "comm");

            for (int i = 0; i < 50; i++) {
                System.out.println("=");
            }
            System.out.println();

            while (rs.next()) {
                System.out.printf("%-10S%-10S%10S%10S", rs.getString("ename"), rs.getString("job"), rs.getDouble("sal"),
                        rs.getDouble("comm"));
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }
}