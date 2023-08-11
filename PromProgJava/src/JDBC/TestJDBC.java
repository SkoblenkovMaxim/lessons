import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC{
    public static void main(String[] args){

        try{
            //Загружаем драйвер
            String driverName = "org.postgresql.Driver";
            Class.forName(driverName);
            //Устанавливаем соединение с сервером БД
            //Устанавливаем url, имя пользователя "root" и пароль "pass"
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/testWork", "root", "pass");
            //
            Statement statement = connection.createStatement();
            //Выполним запрос в БД
            ResultSet result1 = statement.executeQuery("SELECT * FROM Employee");
            //Выведем результат result1
            System.out.println("До");
            while (result1.next()){
                System.out.println("UserID: " + result1.getInt("userID") + " userName: " + result1.getString("userName") + " age " + result1.getInt("age"));
            }
            //Вставим значения в таблицу Employee
            statement.executeUpdate("INSERT INTO Employee (userID, userName, age) VALUES (1, 'Скобленков Максим', 37)");
            statement.executeUpdate("INSERT INTO Employee (userID, userName, age) VALUES (2, 'Ветлугин Андрей', 37)");
            //Обновим запись
            statement.executeUpdate("UPDATE Employee SET *");
            System.out.println("После");
            while (result1.next()){
                System.out.println("UserID: " + result1.getInt("userID") + " userName: " + result1.getString("userName") + " age " + result1.getInt("age"));
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            connection.close();
        }

    }

}