import java.util.Scanner;

public class Practikum {
	
	
	
	public static void main(String[] args) {
		double[] expenses = new double[7];
		Scanner scanner = new Scanner(System.in);
		while(true) {
			//Scanner scanner = new Scanner(System.in);
			double moneyBeforeSalary = scanner.nextDouble();
			int daysBeforeSalary = scanner.nextInt();
			
			printMenu();
			
			int command = scanner.nextInt();
			
			if (command == 1) {
				convert(scanner, moneyBeforeSalary);
			}
			else if (command == 2) {
				getAdvice(moneyBeforeSalary, daysBeforeSalary);
			}
			else if (command == 3) {
				System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
                int day = scanner.nextInt();
                System.out.println("Введите размер траты:");
                double expense = scanner.nextDouble();
                moneyBeforeSalary = moneyBeforeSalary - expense;
                expenses[day - 1] = expenses[day - 1] + expense;
                System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
                if (moneyBeforeSalary < 1000) {
                    System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
                }
			}
			else if (command == 4) {
				for (int i = 0; i < expenses.length; i++) {
                    System.out.println("День " + (i + 1) + ". Потрачено " + expenses[i] + " рублей");
                }
			}
			else if (command == 5) {
				double maxExpense = 0;
                for (int i = 0; i < expenses.length; i++) {
                    if (expenses[i] > maxExpense) {
                        maxExpense = expenses[i];
                    }
                }
                System.out.println("Самая большая сумма расходов на этой неделе составила " + maxExpense + " руб.");
			}
			else if (command == 0) {
				System.out.println("Выход");
                break;
			}
			else {
				System.out.println("Извините, такой команды пока нет.");
			}
		}
		
	}
	
	public static void printMenu() {
		System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Конвертировать валюту");
        System.out.println("2 - Получить совет");
        System.out.println("3 - Ввести трату");
        System.out.println("4 - Показать траты за неделю");
        System.out.println("5 - Показать самую большую сумму расходов за неделю");
        System.out.println("0 - Выход");
	}
	
	public static void convert(Scanner scanner, double moneyBeforeSalary) {
		double rateUSD = 78.5;
        double rateEUR = 85;
        double rateJPY = 0.74;
        
        System.out.println("Ваши сбережения: " + moneyBeforeSalary + " RUB");
        System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
        int currency = scanner.nextInt();
        if (currency == 1) {
            System.out.println("Ваши сбережения в долларах: " + moneyBeforeSalary / rateUSD);
        } else if (currency == 2) {
            System.out.println("Ваши сбережения в евро: " + moneyBeforeSalary / rateEUR);
        } else if (currency == 3) {
            System.out.println("Ваши сбережения в иенах: " + moneyBeforeSalary / rateJPY);
        } else {
            System.out.println("Неизвестная валюта");
        }
    }
	
	public static void getAdvice(double moneyBeforeSalary, int daysBeforeSalary) {
		//System.out.println("Сколько денег у вас осталось до зарплаты?");
        //moneyBeforeSalary = scanner.nextDouble();

        //System.out.println("Сколько дней до зарплаты?");
        //daysBeforeSalary = scanner.nextInt();
        
        if (moneyBeforeSalary < 3000) {
            System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
                } else if (moneyBeforeSalary < 10000){
                    if (daysBeforeSalary < 10) {
                        System.out.println("Окей, пора в Макдак!");
                    } else {
                        System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
                    }
                } else if (moneyBeforeSalary < 30000) {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
                    } else {
                        System.out.println("Окей, пора в Макдак!");
                    }
                } else {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Отлично! Заказывайте крабов!");
                    } else {
                        System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
                    }
        }
	}

}
