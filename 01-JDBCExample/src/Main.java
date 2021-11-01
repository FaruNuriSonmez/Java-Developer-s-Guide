import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        insert();
        select();
        update();
        delete();
    }

    public static void insert() throws SQLException{
        Connection connection = null;
        DatabaseHelper databaseHelper = new DatabaseHelper();

        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = databaseHelper.getConnection();
            String sql = "insert into city(Name,CountryCode,District,Population) \n" + "values(?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Konya");
            statement.setString(2,"TUR");
            statement.setString(3,"Anadolu");
            statement.setString(4,"100000");
            int result  = statement.executeUpdate();
            System.out.println(result +"Insert Success.");
        }
        catch (SQLException e){
            databaseHelper.showErrorMessage(e);
        }
        finally {
            statement.close();
            connection.close();
        }
    }

    public static void select() throws SQLException{
        Connection connection = null;
        DatabaseHelper databaseHelper = new DatabaseHelper();

        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = databaseHelper.getConnection();

            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");

            ArrayList<Country> countries = new ArrayList<Country>();

            while (resultSet.next()){
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }
            System.out.println(countries.size());

        }
        catch (SQLException e){
            databaseHelper.showErrorMessage(e);
        }
        finally {
            connection.close();
        }
    }

    public static void update() throws SQLException{
        Connection connection = null;
        DatabaseHelper databaseHelper = new DatabaseHelper();

        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = databaseHelper.getConnection();
            String sql = "update city set population=7000 where id= ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4086);
            int result  = statement.executeUpdate();
            System.out.println(result +"Update Success.");
        }
        catch (SQLException e){
            databaseHelper.showErrorMessage(e);
        }
        finally {
            statement.close();
            connection.close();
        }
    }

    public static void delete() throws SQLException{
        Connection connection = null;
        DatabaseHelper databaseHelper = new DatabaseHelper();

        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = databaseHelper.getConnection();
            String sql = "delete from city where id= ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4086);
            int result  = statement.executeUpdate();
            System.out.println(result +"Delete Success.");
        }
        catch (SQLException e){
            databaseHelper.showErrorMessage(e);
        }
        finally {
            statement.close();
            connection.close();
        }
    }
}
