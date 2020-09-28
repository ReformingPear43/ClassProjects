package defaultPackage;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	

	
	public static void main(String[] args) {
		JFrame window =  new JFrame();
		window.setSize(640,480);
		window.setTitle("Lottery Game");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(false);
		
		
		
		
		int chance = 3;
		//(int)((Math.random()*7)+1)
		Drawing DC = new Drawing();
		Start s = new Start();
		
		
		
			
			window.setVisible(true);

			
			
		
			JButton a = new JButton(DC);
		    window.setContentPane(a);

			a.addActionListener(new ActionListener() {
				@Override
		        public void actionPerformed(ActionEvent e) {
		        	JButton restart = new JButton(s);
		            
		            window.setContentPane(restart);
		            window.revalidate();
		            restart.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							if (chance ==1 || chance==2) {
								//win
								if(chance==1) {
									Win w = new Win();
									window.setContentPane(w);
									window.revalidate();
								}
								else {
									Win2 w = new Win2();
									window.setContentPane(w);
									window.revalidate();
								}
								
							}
							else {
								
								//lose
								if(chance==3) {
									Loose l =new Loose();
									window.setContentPane(l);
									window.revalidate();
								}
								else if(chance==4) {
									Loose2 l1 =new Loose2();
									window.setContentPane(l1);
									window.revalidate();
								}
								else if(chance==5) {
									Lose3 l2 =new Lose3();
									window.setContentPane(l2);
									window.revalidate();
								}
								else if(chance==6) {
									Lose4 l3 =new Lose4();
									window.setContentPane(l3);
									window.revalidate();
								}
								else if(chance==7) {
									Lose5 l4 =new Lose5();
									window.setContentPane(l4);
									window.revalidate();
								}
								else  {
									Lose6 l5 =new Lose6();
									window.setContentPane(l5);
									window.revalidate();
								}
						}
							
							
							
						}
		            	
		            });
		            
		        }
		        
			
		    });
			
			
			
			
		
		
	}
	
	



}