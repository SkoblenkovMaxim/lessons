/*
 * Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы
 */
public class SearchNumbers {
	public static void main(String[] args) {
		for(int i = 2; i <= 100; i++) {
			for(int j = 2; j <=i; j++) {
				if(j%i == 0) {
					System.out.print(j + " ");
				}
			}
		}
	}

}
