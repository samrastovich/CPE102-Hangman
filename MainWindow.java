import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MainWindow extends JFrame {
	
	private int remainingGuesses;
	private String wrongGuesses;
	private String word;
	private String visible;
	private String lettersRemaining;

	public MainWindow(String toGuess) {
		remainingGuesses = 10;
		wrongGuesses = "";
		lettersRemaining = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
		
		word = toGuess;

		visible = "";

		for(int i = 0; i < word.length(); ++i) {
			visible += "_ ";
		}

		JPanel corePanel = new JPanel();
		corePanel.setLayout(new BorderLayout());
		
		final JLabel status = new JLabel("You have " + remainingGuesses + " guesses remaining", SwingConstants.CENTER);
		final JLabel wrong = new JLabel("Wrong guesses so far: " + wrongGuesses);
		final JLabel lettersRemainingOut =  new JLabel("Letters remaining so far: " + lettersRemaining);
		final JLabel visibleLabel = new JLabel(visible, SwingConstants.CENTER);
		final JTextField input = new JTextField(); 
		
		JPanel southPanel = new JPanel(new GridLayout(5, 1));
		southPanel.add(status);
		southPanel.add(visibleLabel);
		southPanel.add(input);
		southPanel.add(wrong);
		southPanel.add(lettersRemainingOut);
		
		corePanel.add(southPanel, BorderLayout.SOUTH);
		
		final HangmanFigure hf = new HangmanFigure();
		corePanel.add(hf, BorderLayout.CENTER);

		this.add(corePanel, BorderLayout.CENTER);
		
		input.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String text = input.getText();
				
				
				if(text.length()  == 1 && text.matches("[a-z]")) {
					
					boolean guessFound = false;
					
					lettersRemaining = lettersRemaining.replace(text.charAt(0), ' ');
					lettersRemainingOut.setText("Letters remaining so far: " + lettersRemaining);
					
					for(int i = 0; i < word.length(); ++i) {
						if(text.charAt(0) == word.charAt(i)) {
							guessFound = true;
							
							String newVisible = "";
							for(int j = 0; j < visible.length(); ++j) {
								if(j == (i*2)) {
									newVisible += word.charAt(i);
								}
								else {
									newVisible += visible.charAt(j);
								}
							}
							visible = newVisible;
							visibleLabel.setText(visible);
						}
					}
					
					if(!guessFound) {
						if(--remainingGuesses >= 0) {
							status.setText("You have "+remainingGuesses+" guesses remaining");
							wrongGuesses += text+" ";
							wrong.setText("Wrong guesses so far: "+wrongGuesses);
							hf.set();
						}
						else {
							status.setText("You lost: the word was "+word);
							input.setEnabled(false);
						}
					}
					else {
						String actualVisible = "";
						for(int i = 0; i < visible.length(); i+=2) {
							actualVisible += visible.charAt(i);
						}
						
						if(actualVisible.equals(word)) {
							status.setText("Congratulations, you have won!");
							input.setEnabled(false);
						}
					}
					
				}
				else {
					System.out.println("Invalid input!");
				}
				
				input.setText("");
			}
			
		});
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
