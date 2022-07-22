package com.yizhifu.web.servlet;

import java.sql.*;

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
    public static void close(ResultSet resultSet, PreparedStatement statement, Connection connection) {
        if (resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
