package rframe;
import java.awt.BorderLayout;

import javax.swing.JFrame;

import leftpanel.WestPanel;
import toppanel.TopBar;


public class RFrame extends JFrame {
	private static final int DEFAULT_WIDTH = 1200;
	private static final int DEFAULT_HEIGHT = 800; 
	TopBar topBanana;
	WestPanel westBanana;
	public RFrame(){
		super();
		this.setTitle("Wall-E");
		this.setLayout(new BorderLayout());
		
		topBanana = new TopBar();
		westBanana = new WestPanel();
		
		this.getContentPane().add(topBanana,BorderLayout.NORTH);
		this.getContentPane().add(westBanana, BorderLayout.WEST);
		
		this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
	
	public static void main(String[] args){
		JFrame frame = new RFrame();
		frame.setVisible(true);
	}
}



