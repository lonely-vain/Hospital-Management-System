import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectMSSQL {

    public void connectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
/*
            System.out.println("Sql:"
                    + connection.getMetaData().getDatabaseProductName());
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT *FROM login");
            while (resultSet.next()) {
                System.out.println("Username:"
                        + resultSet.getString("UserName"));
                System.out.println("Password:"
                        + resultSet.getString("password"));
            }
            */

    
        
      
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
