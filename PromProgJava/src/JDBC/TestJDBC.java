package src.JDBC;

import java.sql.*;

public class TestJDBC{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://127.0.0.1:5432/work";
        String user = "postgres";
        String password = "9Luck_Maks!_%";
        Connection connection = null;
        //Загружаем драйвер
        Class.forName("org.postgresql.Driver");
        try{
            //Устанавливаем соединение с сервером БД
            connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            System.out.println("1_БД до внесения записей");
            //Выполним запрос в БД
            ResultSet result1 = statement.executeQuery("SELECT * FROM Employee");
            //Выведем результат result1
            while (result1.next()){
                System.out.println("UserID: " + result1.getInt("userID") + " userName: " + result1.getString("userName") + " age " + result1.getInt("age"));
            }
            //Вставим значения в таблицу Employee
            statement.executeUpdate("INSERT INTO Employee (userid, username, age, city) VALUES (2, 'Максим', 37, 'Samara')");
            statement.executeUpdate("INSERT INTO Employee (userid, username, age, city) VALUES (3, 'Андрей', 37, 'Samara')");
            System.out.println("2_БД после добавления записей");
            result1 = statement.executeQuery("SELECT * FROM Employee");
            while (result1.next()){
                System.out.println("UserID: " + result1.getInt("userID") + " userName: " + result1.getString("userName") + " age " + result1.getInt("age") + " city: " + result1.getString("city"));
            }
            statement.executeUpdate("DELETE FROM Employee WHERE userID = 3");
            System.out.println("3_БД после удаления записи");
            result1 = statement.executeQuery("SELECT * FROM Employee");
            while (result1.next()){
                System.out.println("UserID: " + result1.getInt("userID") + " userName: " + result1.getString("userName") + " age " + result1.getInt("age") + " city: " + result1.getString("city"));
            }
        } catch (Exception e){
            e.printStackTrace();
          } finally {
            assert connection != null;
            connection.close();
        }
    }

}
