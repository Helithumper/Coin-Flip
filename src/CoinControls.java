import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CoinControls extends JPanel {
	
	
	//Instance Fields
	private JButton flipBtn;
	private Coin coin;
	private CoinPanel coinPanel;
	
	//Constructor
	public CoinControls(CoinPanel coinPanel, Coin coin /*myCoin*/) { //What is different between a constructor and a setter? They are exactly the same except for the "void"
		//myCoin = c;
		this.coinPanel = coinPanel;
		this.coin = coin;
		flipBtn = new JButton("Flip Me!");
		flipBtn.setToolTipText("Flips the Coin.");
		flipBtn.addActionListener(new ButtonListener());
		
		setBackground(Color.WHITE);
		add(flipBtn);
	}
	
	//Methods
	
	//internal class, which can be seen by the external class
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			coin.flip();
			coinPanel.repaint();
		}//end of method
	}//End of internal Class
}//end of external class
