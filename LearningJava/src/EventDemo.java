import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventDemo {
	JLabel jlab;
	EventDemo(){
		//создание контейнера
		JFrame jfrm = new JFrame("Пример обработки события");
		
		//Создание диспетчера компоновки
		jfrm.setLayout(new FlowLayout());
		
		//установим размеры
		jfrm.setSize(400, 300);
		
		//закончить работу, когда пользователь закроет приложение
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Создать две кнопки
		JButton jbtnAlpha = new JButton("ALPHA");
		JButton jbtnBeta = new JButton("Beta");
		
		//добавить прослушиватель событий для кнопки ALPHA
		jbtnAlpha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("Нажата кнопка ALPHA");
			}
		});
		
		//добавить прослушиватель событий для кнопки BETA
		jbtnBeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("Нажата кнопка BETA");
			}
		});
		
		//добавим кнопки в JFrame
		jfrm.add(jbtnAlpha);
		jfrm.add(jbtnBeta);
		
		//Создадим текстовую метку
		JLabel jlab = new JLabel("Нажми кнопку");
		
		//добавим метку в JFRAME
		jfrm.add(jlab);
		
		//видимость фрейма
		jfrm.setVisible(true);
				
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new EventDemo();
			}
		});
	}

}
