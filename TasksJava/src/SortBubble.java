/*
* Реализация алгоритма сортировки пузырьком для сортировки массива
*/

public class SortBubble {
	public static void main(String[] args) {
		int n = 10;
		double[] array = new double[n];
		
		//Заполнение массива случайными целыми числами
		for(int i = 0; i < array.length; i++) {
			array[i] = Math.random();
			//Просмотр массива со случайными числами
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
						
		//реализация сортировки пузырьком
		for(int k = 0; k < array.length; k++) {
			for(int l = 0; l < array.length-k-1; l++) {
				if(array[l + 1] < array[l]) {
					double m = array[l];
					array[l] = array[l + 1];
					array[l+1] = m;
				}
				
			}
		}
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
	}

}
