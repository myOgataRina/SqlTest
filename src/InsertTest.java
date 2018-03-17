import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
       public static void main(String[] args){
           try {
               Class.forName("com.mysql.jdbc.Driver");
               Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/system","root","asd739391701j");
               Statement stmt = connection.createStatement();
               //插入语句
               if(stmt.execute("INSERT INTO test ( id, name, regTime) VALUES (1, \'王老师\',now())")){
                   System.out.println("INSERT SUCCESS");
               };
           } catch (SQLException e) {
               e.printStackTrace();
           } catch (ClassNotFoundException e) {
               e.printStackTrace();
           }
       }
}
