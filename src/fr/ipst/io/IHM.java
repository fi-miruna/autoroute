package fr.ipst.io;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class IHM {
	
	public static void main(String[] args) {
	
		JFrame fenetre = new JFrame();
		fenetre.setTitle("Autoroute");
		fenetre.setSize(1000,1000);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setVisible(true);

		JPanel panel = new JPanel();

		fenetre.setContentPane(panel);
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.cyan);
	}
}