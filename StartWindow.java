import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class StartWindow extends JFrame {
	
	private static int response;
	
	public StartWindow(){
		
		response = 0;
		
		JLabel title = new JLabel("Select a word length to guess: ");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		
		JPanel panel = new JPanel();
		panel.add(title);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		
		this.add(panel);
		
		class button3Listener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				response = 3;
			}
		}
		button3.addActionListener(new button3Listener());
		class button4Listener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				response = 4;
			}
		}
		button4.addActionListener(new button4Listener());
		class button5Listener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				response = 5;
			}
		}
		button5.addActionListener(new button5Listener());
		class button6Listener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				response = 6;
			}
		}
		button6.addActionListener(new button6Listener());
		class button7Listener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				response = 7;
			}
		}
		button7.addActionListener(new button7Listener());
		class button8Listener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				response = 8;
			}
		}
		button8.addActionListener(new button8Listener());
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) throws InterruptedException {
		boolean run = true;
		
//		while (run) {
			StartWindow start = new StartWindow();
			WordBank wordBank = new WordBank();
			while (response == 0)
			{
				Thread.sleep(100);
			}
			start.dispose();
			new MainWindow(wordBank.getNewWord(response));
//		}
	}
}
