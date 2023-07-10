import javax.swing.*;

public class LeaSwing {
	LeaSwing(){
		//Создание контейнера JFrame
		JFrame jfrm = new JFrame("Первая swing-программа");
		
		//Устанавливаем начальные размеры фрейма
		jfrm.setSize(250, 100);
		
		//Прекратить работу, когда пользователь закроет программу
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Создание текстовой метки
		JLabel jlab = new JLabel("Swing GUI");
		
		//добавляем метку в панель содержимого
		jfrm.add(jlab);
		
		//отобразить фрейм
		jfrm.setVisible(true);
	}
		
		public static void main(String[] args) {
			//создание фрейма в потоке диспетчирезации события
			SwingUtilities.invokeLater(new Runnable(){
				public void run() {
					new LeaSwing();
				}
			});
		}
	

}
