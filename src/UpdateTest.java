import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/system","root","asd739391701j");
            Statement stmt = connection.createStatement();
            //修改语句
            if(stmt.execute("UPDATE test" +
                    " SET id = 4" +
                    " WHERE name = \'王老师\'")){
                System.out.println("UPDATE SUCCESS");
            };

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
