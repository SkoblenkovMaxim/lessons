/*
 * Создать приложение, выводящее фамилию разработчика, дату и время
получения задания, а также дату и время сдачи задания. Для получения
последней даты и времени использовать класс Calendar из пакета
java.util.
 */
package Part_01;

import java.util.*;

public class DevelopDemo {

	public static void main(String[] args) {
		Developer dev = new Developer();
		//dev.getName();
		//dev.getSurname();
		dev.init();
		dev.initDate();
		dev.closeWork();
		
	}

}


class Developer {
	String name;
	String surname;
	private Calendar calendar;
	
	Scanner scan = new Scanner(System.in);
	
	public String init() {
		System.out.println("Введите ваше имя: ");
		name = scan.next();
		System.out.println("Введите вашу фамилию: ");
		surname = scan.next();
		return name + " " + surname;
	}
	
	
	/*
	public void setName(String name) {
		this.name = name;
		System.out.print("Введите имя и нажмите <Enter>: ");
		name = scan.nextLine();
	}
	
	public String getName() {
		return name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
		System.out.println("Введите фамилию и нажмите <Enter>: ");
		surname = scan.next();
	}
	
	public String getSurname() {
		return surname;
	}
	*/
	public void initDate() {
		calendar = Calendar.getInstance();
		System.out.println(name + " " + surname + "Задание получено " + calendar.get(Calendar.DAY_OF_MONTH) + "." + calendar.get(Calendar.MONTH) 
		+ "." + calendar.get(Calendar.YEAR) + " " 
		+ calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE));
	}
	
	public void closeWork() {
		calendar = Calendar.getInstance();
		System.out.println(name + " " + surname + "Задание завершено " + calendar.get(Calendar.DAY_OF_MONTH) + "." + calendar.get(Calendar.MONTH) 
		+ "." + calendar.get(Calendar.YEAR) + " " 
		+ calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE));
	}
}