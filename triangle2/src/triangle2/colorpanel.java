package triangle2;
import javax.swing.*;
import java.text.DecimalFormat;


import java.awt.*;
import java.awt.event.*;

public class colorpanel extends JPanel {
	int px, py;
	int numclicks = 0;
	point p1 = new point();
	point p2 = new point();
	point p3 = new point();
	point p4 = new point();
	point p5 = new point();
	point p6 = new point();
	public colorpanel(Color backcolor) {
		setBackground(backcolor);
		addMouseListener(new PanelListener());
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int temp1 = getWidth() / 2;
		int temp2 = getHeight() / 2;
		DecimalFormat df = new DecimalFormat("0.00");
		
		g.setColor(Color.black);
		g.drawLine(0, temp2, temp1*2, temp2);
		g.drawLine(temp1, 0, temp1, temp2*2);

		
		if (numclicks == 1) {
			p1.setX(px);
			p1.setY(py);
			g.drawString("(" + p1.getCoorx(getWidth()) + "," + p1.getCoory(getHeight()) + ")", p1.getX() - 5, p1.getY() - 5);
			g.drawOval(px, py, 3, 3);
		}
		else if (numclicks == 2 ) {
			p2.setX(px);
			p2.setY(py);
			g.drawLine(p1.x, p1.y, p2.x, p2.y);
			g.drawString("(" + p1.getCoorx(getWidth()) + "," + p1.getCoory(getHeight()) + ")", p1.getX()-5, p1.getY()-5);
			g.drawString("(" + p2.getCoorx(getWidth()) + "," + p2.getCoory(getHeight()) + ")", p2.getX()-5, p2.getY()-5);
			g.drawOval(p2.getX(), p2.getY(), 1, 1);
			g.drawOval(p1.getX(), p1.getY(), 1, 1);
		}
		else if (numclicks == 3) {
			p3.setX(px);
			p3.setY(py);
			numclicks = 0;
			triangle p = new triangle();
			p = new triangle(p1, p2, p3);
			g.drawLine(p1.x, p1.y, p2.x, p2.y);
			g.drawLine(p1.x, p1.y, p3.x, p3.y);
			g.drawLine(p2.x, p2.y, p3.x, p3.y);
			g.drawString("(" + p1.getCoorx(getWidth()) + "," + p1.getCoory(getHeight()) + ")", p1.getX()-5, p1.getY()-5);
			g.drawString("(" + p2.getCoorx(getWidth()) + "," + p2.getCoory(getHeight()) + ")", p2.getX()-5, p2.getY()-5);
			g.drawString("(" + p3.getCoorx(getWidth()) + "," + p3.getCoory(getHeight()) + ")", p3.getX()-5, p3.getY()-5);
			g.drawOval(p2.getX(), p2.getY(), 1, 1);
			g.drawOval(p1.getX(), p1.getY(), 1, 1);
			g.drawOval(p3.getX(), p3.getY(), 1, 1);
			if (p.isTri() == true) {
			g.drawString((df.format(p.l1.distance())), (p1.x + p2.x)/2, (p1.y + p2.y)/2);
			g.drawString((df.format(p.l2.distance())), (p3.x + p2.x)/2, (p3.y + p2.y)/2);
			g.drawString((df.format(p.l3.distance())), (p1.x + p3.x)/2, (p1.y + p3.y)/2);
			g.drawString(df.format(p.area()), (p1.getX() + p2.getX() + p3.getX()) /3,(p1.getY() + p2.getY() + p3.getY()) /3);
			System.out.println(p.type());
			}			
		}
		
		
	}
	
	public class PanelListener extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			px = e.getX();
		    py = e.getY();
		    numclicks++;
		    repaint();
		}
	}
}

				
				
			
				