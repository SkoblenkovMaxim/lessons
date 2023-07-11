package Part_01;

import java.awt.Graphics;
import java.util.*;
import javax.swing.*;

public class DecApletDemo {
	
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
