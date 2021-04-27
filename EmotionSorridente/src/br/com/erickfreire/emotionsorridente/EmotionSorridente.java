package br.com.erickfreire.emotionsorridente;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Programa em Java que desenha um Emotion Sorridente
 * @author Erick Freire
 * @version 1 - Criado em 26-04-2021 as 22:56
 */

public class EmotionSorridente extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200, 200);
		
		
		g.setColor(Color.BLACK);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135, 65, 30, 30);
		
		
		g.fillOval(50, 110, 120, 60);
		
		g.setColor(Color.YELLOW);
		g.fillRect(50, 110, 120, 30);
		g.fillOval(50, 120, 120, 40);
		
		
	}

}
