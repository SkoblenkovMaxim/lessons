/*
 * Упражнение 2
Напишите консольную программу, в которой пользователь вводит с клавиатуры число. 
Если число одновременно меньше 9 и больше 2, то программа выводит "Число больше 5 и меньше 10". 
Иначе программа выводит сообщение "Неизвестное число".
 */
import java.util.Scanner;

public class CompareNumber2 {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		int num = number.nextInt();
		
		if(num > 2 && num < 9) {
			System.out.println("Число больше 2 и меньше 9");
		}
		else {
			System.out.println("Неизвестное число");
		}
		
		number.close();

	}

}
