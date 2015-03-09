import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class CoinPanel extends JPanel {
	
	//Instance Fields
	//Double Assignment of variables, instantiation
	private Coin coin;
	private ImageIcon headsIcon, tailsIcon;
	private JLabel imgLabel;
	
	//Methods
	
	//Constructor
	public CoinPanel(Coin coin) { //Signature for the Constructor
		this.coin = coin;
		//Assignment of Instance Fields
		headsIcon = new ImageIcon ("romanheads.png");
		tailsIcon = new ImageIcon ("romantails.png");
		//Creates label for title
		imgLabel = new JLabel("Coin Game",headsIcon, SwingConstants.CENTER);
		//Sets location of Title Label
		imgLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		imgLabel.setVerticalTextPosition(SwingConstants.TOP);
		//adds the label to the panel
		add(imgLabel);
		//sets the background color
		setBackground(Color.WHITE);
		//sets the size of the panel
		setPreferredSize(new Dimension(400,400));
		
	}// end of constructor
	
	//Assessors and Mutators
	//Methods
	public void repaint() {
		//if you don't have a condition, then you will get a NullPointer Exception
		if (coin != null) {
			//Prints out the flipping the coin so we can see if the flip actually works
			System.out.println("Coin: " + coin);
		if(coin.getFace().equals("Heads")) { imgLabel.setIcon(headsIcon);  }
		if(coin.getFace().equals("Tails")) { imgLabel.setIcon(tailsIcon); }
			
		}
		super.repaint();
		
		
	}//End of external class
	
	//toString()
}
