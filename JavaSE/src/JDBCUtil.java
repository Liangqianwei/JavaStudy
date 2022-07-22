import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    //静态代码块保证当类加载的时候代码只执行一次
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection() throws SQLException {
        //静态代码块保证当类加载的时候代码只执行一次
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadata?useUnicode=true&characterEncoding=UTF-8","root","000214");
        return connection;
    }
}
