import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/system","root","asd739391701j");
            Statement stmt = connection.createStatement();

            //删除语句
            String sql = "DELETE FROM test WHERE NAME = \'王老师\'";
            if(stmt.execute(sql)){
                System.out.println("DELETE SUCCESS");
            };
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
