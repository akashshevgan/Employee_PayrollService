import java.sql.Connection;
import java.sql.DriverManager;

public class Employee_PayrollDBService {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service";
        String userName = "root";
        String password = "root";
        Connection conn;
        try {
            System.out.println("Connecting to database:"+jdbcURL);
            conn = DriverManager.getConnection(jdbcURL,userName,password);
            System.out.println("Connection is Successful"+conn);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}