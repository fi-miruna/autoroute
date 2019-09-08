import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;

import javax.swing.*;

public class IHM {
	
	public static void main(String[] args) {
	
		JFrame fenetre = new JFrame();
		fenetre.setTitle("Autoroute");
		fenetre.setSize(1000,1000);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

		JPanel panel = new JPanel();

		fenetre.setContentPane(panel);
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.cyan);
		
		JTextArea tex = new JTextArea();
		tex.setBackground(Color.ORANGE);
		panel.add(tex, BorderLayout.CENTER);
		tex.setSize(1000,500);
		
		
		fenetre.setVisible(true);
		
		
		JButton b = new JButton("Start");
		panel.add(b, BorderLayout.SOUTH);
		
		
		// b.addActionListener(new ActionListener(){
		// 	public void actionPerformed(ActionEvent e){
		// 		Autoroute auto= new Autoroute();
		// 		auto.simuler();
		// 		PrintStream printStream = new PrintStream(new CustomOutputStream(tex));
		// 		System.setOut(printStream);
		// 		System.setErr(printStream);
		// 	}
		// });
		
		fenetre.setVisible(true);
		
		
	}
}	