package defaultPackage;

import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class Loose  extends JComponent implements Icon {
	
	Scanner scan = new Scanner(System.in);
	;
public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		
		
		
		
		
		
		
		
		//all labeled on notes
		g2.drawString("To Win" , 300, 60);
		g2.drawString("1" , 216,195);
		g2.drawString("1" , 420,195);
		g2.drawString("2" , 318,195);
		g2.drawString("BAD", 293, 340);
		g2.drawString("1 1 1", 170, 110);
		g2.drawString("2 2 2", 445, 110);
		Rectangle rect1 = new Rectangle(160 , 120, 320, 300);
		g2.draw(rect1);
		Rectangle rect2 = new Rectangle(160 , 40, 320, 80);
		g2.draw(rect2);
		Rectangle rect3 = new Rectangle(165,45,310,75);
		g2.draw(rect3);
		Rectangle rect4 = new Rectangle(165,125,310,140);
		g2.draw(rect4);
		Rectangle rect5 = new Rectangle(160 , 270, 320, 150);
		g2.draw(rect5);
		//slots for numbers
		Rectangle spot1 = new Rectangle(191,155,51,80);
		g2.draw(spot1);
		Rectangle spot2 = new Rectangle(293,155,51,80);
		g2.draw(spot2);
		Rectangle spot3 = new Rectangle(395,155,51,80);
		g2.draw(spot3);
		//screen to display instructions
		Rectangle screen = new Rectangle (216,300,210,80);
		g2.draw(screen);
		Rectangle SLOT = new Rectangle (263,400,103,20);
		g2.draw(SLOT);

		
		
		
		
		
		
		
		
		
		
	}
@Override
public void paintIcon(Component c, Graphics g, int x, int y) {
	// TODO Auto-generated method stub
	
}
@Override
public int getIconWidth() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public int getIconHeight() {
	// TODO Auto-generated method stub
	return 0;
}

}