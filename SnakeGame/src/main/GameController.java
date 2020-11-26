package main;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import javax.swing.JLabel;
import java.awt.Toolkit;
//import java.nio.file.Path;
//import java.nio.file.Paths;

//import javax.scene.image.Image;
//import javax.swing.*;
public class GameController extends JFrame{
	final static int FRAME_WIDTH = 500;
	final static int FRAME_HEIGHT = 500;
	final static int FRAME_DIVIDE = 20;
	JButton StartButoon;
	JButton ExitButoon;
	public GameController() {
		StartButoon = new JButton("Start Game");
		ExitButoon = new JButton("Exit Game");
		JLabel title= new JLabel("The Snake Game");
//		Path currentRelativePath = Paths.get("");
//		String s = currentRelativePath.toAbsolutePath().toString();
//		System.out.println("Current relative path is: " + s);
		System.out.println("In controller");
		Image snake_background =Toolkit.getDefaultToolkit().getImage("src/main/Background.jpg");		
		this.setContentPane(new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				
				System.out.println("In paintComponent");
				super.paintComponent(g);
				g.drawImage(snake_background, 0, 0, null);
				for(int i=0;i<500;i++) {
					g.drawLine(i*FRAME_DIVIDE,0,i*FRAME_DIVIDE, FRAME_HEIGHT);
					g.drawLine(0,i*FRAME_DIVIDE,FRAME_WIDTH,i*FRAME_DIVIDE);
				}
				
			}
		});
		System.out.println("In Game controller");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setBackground(Color.black);
		setLayout(new FlowLayout());
		add(title);
		
		add(StartButoon);
		add(ExitButoon);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		StartButoon.addActionListener(ae ->{
			setVisible(false);
			System.out.println("In Start Button");
			System.exit(0);
			//GameFrame game=new GameFrame();
		});
		ExitButoon.addActionListener(ae ->{
			System.exit(0);
		});
		
		//System.exit(0);
	}
	
}
