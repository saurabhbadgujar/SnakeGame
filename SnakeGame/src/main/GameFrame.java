package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.Timer;

public class GameFrame extends JFrame implements ActionListener{
	final static int WINDOW_HEIGHT = 600;
	final static int WINDOW_WIDTH = 600;
	final static int GRID_PARAMETER = 20;
	final static int DELAY = 75 ;
	final static int GRID_SIZE = (int)(WINDOW_HEIGHT*WINDOW_WIDTH/GRID_PARAMETER);
	static int ApplesCollected;
	int SnakeSize=4;
	int SnakeX[];
	int SnakeY[];
	int FruitX;
	int FruitY;
	
	char direction = 'R';
	boolean running = false;
	Timer timer;
	Random rand;
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		drawPanel(g);
	}
	public GameFrame() {
		ApplesCollected = 0;
		SnakeX=new int[GRID_SIZE];
		SnakeY=new int[GRID_SIZE];
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setBackground(Color.black);
		setVisible(true);
		start();
		
		
	}
	public void start() {		
		running = true;
		timer = new Timer(DELAY, this);
		timer.start();
	}
	public void drawPanel(Graphics g) {
		g.setColor(Color.white);
		for(int i = 0;i <WINDOW_HEIGHT;i++) {			
			g.drawLine(i*GRID_SIZE,0,WINDOW_HEIGHT,i*GRID_SIZE);
			
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

