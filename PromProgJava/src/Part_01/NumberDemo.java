/*
 * Создать программу ввода целых чисел как аргументов командной строки, 
 * подсчета их суммы (произведения) и вывода результата на консоль
 */
package Part_01;

import java.util.Scanner;

public class NumberDemo {
	public static void main(String[] args) throws java.io.IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите целое число и нажмите <Enter>: ");
		int num = sc.nextInt();
		System.out.println(num);
		
		sc.close();
	}
	
}

class Number {
	
}