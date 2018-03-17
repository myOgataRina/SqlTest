import java.sql.*;

public class Test {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/system","root","asd739391701j");
            Statement stmt = con.createStatement();
            //建表语句
            if(stmt.execute("CREATE TABLE test(" +
                    "id INT PRIMARY KEY NOT NULL ," +
                    "name VARCHAR(255) NOT NULL , " +
                    "regTime DATETIME " +
                    ")")){
                System.out.println("CREATE TABLE SUSSESS.");
            };
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
