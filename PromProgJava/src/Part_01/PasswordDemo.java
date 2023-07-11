/*
 * Создать приложение для ввода пароля из командной строки и 
 * сравнения его со строкой-образцом
 */

package Part_01;
import java.util.Scanner;
public class PasswordDemo {
	public static void main(String[] args) {
		Password obj = new Password();
		obj.setPass("123");
		obj.getPass();
	}

}

class Password {
	private String pass = "123";
	
	public void setPass(String word) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите пароль и нажмите <Enter>: ");
		word = scan.next();
		if(word.equals(pass)) {
			System.out.println("Пароль введен верно!");
		}
		else {
			System.out.println("Неверный пароль!");
		}
		scan.close();
	}
	
	public String getPass() {
		return pass;
	}
}