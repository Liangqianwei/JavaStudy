import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;

public class JDBC {
    @Test
    public void test1(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadata?useUnicode=true&characterEncoding=UTF-8","root","000214");
            String sql = "select id,name,age,gender from student";
            Statement statement = connection.createStatement();
            ResultSet  resultSet = statement.executeQuery(sql);
            ArrayList<Student> arrayList = new ArrayList<>();
            while(resultSet.next()){
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");
                int id = resultSet.getInt("id");
                Student student = new Student(id,name,age,gender);
                arrayList.add(student);
            }
            for (Student student : arrayList) {
                System.out.println(student.getAge());
                System.out.println(student.getGender());
                System.out.println(student.getId());
                System.out.println(student.getName());
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void test2(){
        int Age = 22;
        String Name = "张三";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadata?userUnicode=true&characterEncoding=UTF-8","root","000214");
            String sql = "select id,name,age,gender from student where age = ? and name = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,Age);
            statement.setString(2,Name);
            System.out.println(statement);
            statement.executeQuery();
            ResultSet resultSet = statement.executeQuery();
            ArrayList<Student> list = new ArrayList<>();
            while(resultSet.next()){
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");
                int id = resultSet.getInt("id");
                Student student = new Student(id,name,age,gender);
                list.add(student);
            }
            for (Student student : list) {
                System.out.println(student);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void test3(){
        int Age = 22;
        String Name = "张三";
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "select id,name,age,gender from student where age = ? and name = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,Age);
            statement.setString(2,Name);
            System.out.println(statement);
            statement.executeQuery();
            ResultSet resultSet = statement.executeQuery();
            ArrayList<Student> list = new ArrayList<>();
            while(resultSet.next()){
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");
                int id = resultSet.getInt("id");
                Student student = new Student(id,name,age,gender);
                list.add(student);
            }
            for (Student student : list) {
                System.out.println(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void testInsert(){
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "insert into student(name,age,gender) values(?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,"小李");
            statement.setInt(2,20);
            statement.setString(3,"男");
            int count = statement.executeUpdate();
            System.out.println("count:" +count);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void testDelete(){
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "delete from student where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,1);
            System.out.println(statement);
            int count = statement.executeUpdate();
            System.out.println("count:"+count);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void testUpdate(){
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "update student set name = ? ,age =? ,gender = ? where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,"校长");
            statement.setInt(2,23);
            statement.setString(3,"女");
            statement.setInt(4,2);
            System.out.println(statement);
            int count = statement.executeUpdate();
            System.out.println("count:"+count);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}