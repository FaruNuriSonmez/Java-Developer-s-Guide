import java.sql.*;

public class DatabaseHelper {

    private String userName = "root";
    private String password = "root";
    private String databaseUrl = "jdbc:mysql://localhost:3306/world?useSSL=false";


    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(databaseUrl,userName,password);
    }

    public void showErrorMessage(SQLException exception){
        System.out.println("Error : " + exception.getMessage());
        System.out.println("Error : " + exception.getErrorCode());
    }



}
