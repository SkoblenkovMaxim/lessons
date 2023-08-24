/*
 * вывести внизу фамилию разра-
ботчика, дату и время получения задания, а также дату и время сдачи задания.
Для получения последней даты и времени следует использовать класс Date.
Добавить комментарии в программы в виде /** комментарий *, извлечь эту
документацию в HTML-файл и просмотреть полученную страницу Web-
браузером
 */
package Part_02;

import java.util.Scanner;
import java.util.Date;

public class InfoDevelop {
	
	
	
	public void fio() {
		/**
		 * @author SkoblenkovMaxim
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("Введите ФИО: ");
		String fio = in.nextLine();
		System.out.print(fio);
		in.close();
	}
	
	public void dateBegin() {
		System.out.println("Задание получено: ");
	}
	
	public void dateFinish() {
		System.out.println("Задание завершено: ");
	}
	
	
}
