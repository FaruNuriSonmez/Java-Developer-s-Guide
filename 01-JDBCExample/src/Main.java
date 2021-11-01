import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    static String userName = "root";
    static String password = "root";
    static String dbUrl = "jdbc:mysql://localhost:3306/world?useSSL=false";

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl,userName,password);
            System.out.println("Connected.");
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        finally {
            connection.close();
        }
    }
}
