package src.JDBC;

import java.sql.*;

public class TestJDBC{
    public static void main(String[] args) {
        String url = "jdbc:postgresql://127.0.0.1:5432/testWork";
        String user = "goofy";
        String password = "9GoFuckYourself&";
        Connection connection;
        try{
            //Загружаем драйвер
            String driverName = "org.postgresql.Driver";
            Class.forName(driverName);
            //Устанавливаем соединение с сервером БД
            connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            System.out.println("БД до внесения записей");
            //Выполним запрос в БД
            ResultSet result1 = statement.executeQuery("SELECT * FROM Employee");
            //Выведем результат result1
            while (result1.next()){
                System.out.println("UserID: " + result1.getInt("userID") + " userName: " + result1.getString("userName") + " age " + result1.getInt("age"));
            }
            //Вставим значения в таблицу Employee
            statement.executeUpdate("INSERT INTO Employee (userID, userName, age) VALUES (1, 'Скобленков Максим', 37)");
            statement.executeUpdate("INSERT INTO Employee (userID, userName, age) VALUES (2, 'Ветлугин Андрей', 37)");
            System.out.println("БД после добавления записей");
            result1 = statement.executeQuery("SELECT * FROM Employee");
            while (result1.next()){
                System.out.println("UserID: " + result1.getInt("userID") + " userName: " + result1.getString("userName") + " age " + result1.getInt("age"));
            }
            statement.executeUpdate("DELETE FROM Employee WHERE userID = 2");
            System.out.println("БД после удаления записи");
            result1 = statement.executeQuery("SELECT * FROM Employee");
            while (result1.next()){
                System.out.println("UserID: " + result1.getInt("userID") + " userName: " + result1.getString("userName") + " age " + result1.getInt("age"));
            }
        } catch (Exception e){
            e.printStackTrace();
          }
    }

}
