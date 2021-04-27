package br.com.erickfreire.emotionsorridente;

import javax.swing.JFrame;

public class EmotionSorridenteTeste {

	public static void main(String[] args) {
		
		EmotionSorridente painel = new EmotionSorridente();
		JFrame aplicacao = new JFrame();
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.add(painel);
		aplicacao.setSize(230,250);
		aplicacao.setVisible(true);
		

	}

}
