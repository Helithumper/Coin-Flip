import javax.swing.BoxLayout;
import javax.swing.JFrame; //Java Swing Library
import javax.swing.JPanel;
//Advanced Windows Toolkit

public class Runner {

	
	public static void main(String[] args) {
	
		//Creates an external graphics frame
		JFrame frame = new JFrame("Coin Game");
		//Adds the upper right close and minimize buttons
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//Create Instance of the Coin
		Coin coin = new Coin();
		CoinPanel coinPanel = new CoinPanel(coin);
		CoinControls controls = new CoinControls(coinPanel, coin);
		
		
		//Creates a new panel
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(coinPanel);
		panel.add(controls);
		
		//add the panel to the frame
		frame.getContentPane().add(panel);
		//Sets the size of the frame
		frame.pack();
		frame.setVisible(true);
		
		
		
		
		}//End of Game Loop
		
	}//End of Main Method

//End of Class
