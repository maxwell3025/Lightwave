package src;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Display extends JFrame{
int width,height;
BufferedImage image;
	public Display(int width,int height) {
		setDefaultCloseOperation(3);
		this.width = width;
		this.height = height;
		setSize(width, height);
		setLocationRelativeTo(null);
		setVisible(true);
		image = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
		repaint();
		image.createGraphics().fillRect(0, 0, 100, 100);
	}
	public synchronized void paint(Graphics g){
		g.drawImage(image, 0, 0, null);
	}

}
