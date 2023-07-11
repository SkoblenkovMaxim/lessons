/*
 * Создать приложение, которое отображает в окне консоли аргументы
командной строки метода main() в обратном порядке.
 */
package Part_01;

public class Argument {
	public static void main(String[] args) {
		for(int i = args.length; i <= args.length; i--) {
			System.out.println("Аргумент -> " + i);
		}
	}

}
