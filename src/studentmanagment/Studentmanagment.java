
package studentmanagment;
/*
* 1. import
* 2. load and register
* 3. create connection
* 4. create statement
* 5. execute statement
* 6. process result
* 7. close 
*/
import java.sql.*;

public class Studentmanagment {

    
    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost:3306/school";
        String user ="root";
        String password = "1234";
        
        String sql = "select * from student where age=22";
        
        Connection con = DriverManager.getConnection(url, user, password);
        Statement st=con.createStatement();
        ResultSet re = st.executeQuery(sql);
        
        re.next();
        String name = re.getString("fullname");
        System.out.println(name);
        
    }
    
}
