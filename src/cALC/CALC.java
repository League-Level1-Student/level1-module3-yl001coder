package cALC;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.util.Random;
public class CALC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		int max = 1000;
		int min = 1;
		int n = (int)(Math.random() * (max - min + 1) + min);
		int guess = 0;
		while(guess != n)
		{
			String e = JOptionPane.showInputDialog(frame,"Guess a number 1 - 1000");
			int num = Integer.parseInt(e);
			if(num > max||(num < min))
			{
				JOptionPane.showMessageDialog(frame, "Please enter a valid number.");				
			}
			else if(num%7 == 0)
			{
				JOptionPane.showMessageDialog(frame, "This is a BAD number.");
				n = rand.nextInt();
			}
			else if(num > n)
			{
				JOptionPane.showMessageDialog(frame, "Guess lower you dummy!");
			}
			else if(num < n)
			{
				JOptionPane.showMessageDialog(frame, "Guess higher you dummy!");
			}
			else if(num == n)
			{
				JOptionPane.showMessageDialog(frame, "Ya got it... ig");
			}
			
		}
		
	}

}
