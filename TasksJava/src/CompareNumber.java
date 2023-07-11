/*
 * Упражнение 1
Напишите консольную программу, в которой пользователь с клавиатуры вводит два числа. 
А программа сранивает два введенных числа и выводит на консоль результат сравнения 
(два числа равны, первое число больше второго или первое число меньше второго).
 */
import java.util.Scanner;

public class CompareNumber {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		int num1 = number.nextInt();
		
		System.out.print("Введите число: ");
		int num2 = number.nextInt();
		
		if(num1 > num2) {
			System.out.println("Первое число больше второго");
		}
		else if(num1 < num2) {
			System.out.println("Первое число меньше второго");
		}
		else {
			System.out.println("Два числа равны");
		}
		number.close();
	}

}
