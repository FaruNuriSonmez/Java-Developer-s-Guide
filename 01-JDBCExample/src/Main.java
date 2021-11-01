import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        DatabaseHelper databaseHelper = new DatabaseHelper();

        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = databaseHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code,Name,Continent, Region from country");

            while (resultSet.next()){
                System.out.println(resultSet.getString("Name"));
            }

        }
        catch (SQLException e){
            databaseHelper.showErrorMessage(e);
        }
        finally {
            connection.close();
        }
    }
}
