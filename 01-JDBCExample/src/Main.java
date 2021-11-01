import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DatabaseHelper databaseHelper = new DatabaseHelper();
        try {
            connection = databaseHelper.getConnection();
            System.out.println("Connected.");
        }
        catch (SQLException e){
            databaseHelper.showErrorMessage(e);
        }
        finally {
            connection.close();
        }
    }
}
