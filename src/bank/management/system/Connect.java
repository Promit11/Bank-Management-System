package bank.management.system;
import java.sql.*;

public class Connect {
    Connection connection;
    Statement statement;
    public Connect(){
        try{
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Promit@2003");
            statement=connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
