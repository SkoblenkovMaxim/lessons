/*Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(), который возвращает значение 
в промежутке [0, 1].
*/
public class MaxMin {
	public static void main(String[] args) {
		int n = 100;
		double[] array = new double[n];
		//Заполнение массива
		for(int i = 0; i < array.length; i++) {
			array[i] = Math.random();
		}
		//Поиск максимального значения в массиве
		double maxNumber = array[0];
		for(int j = 0; j < array.length; j++) {
			if(j > maxNumber) {
				maxNumber = j;
			}
		}
		System.out.println(maxNumber);
		
		//Поиск минимального значения в массиве
		double minNumber = array[0];
		for(int j = 0; j < array.length; j++) {
			if(j < minNumber) {
				minNumber = j;
			}
		}
		System.out.println(minNumber);
		
		//Поиск среднего значения
		double averageValue;
		double sumArray = 0;
		
		for(int k = 0; k < array.length; k++) {
			sumArray += array[k];
		}
		averageValue = sumArray/array.length;
		System.out.println(averageValue);		
		
	}

}
