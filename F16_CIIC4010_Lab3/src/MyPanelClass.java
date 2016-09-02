import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;

public class MyPanelClass extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//Compute interior coordinates
		Insets myInsets = this.getInsets();
		int x1 = myInsets.left;
		int y1 = myInsets.top;
		int x2 = getWidth() - myInsets.right - 1;
		int y2 = getHeight() - myInsets.bottom - 1;

		int ovalWidth =55;
		int ovalHeigth =55;

		int width = x2 - x1;
		int height = y2 - y1;

		//Paint the background
		g.setColor(Color.BLACK);
		g.fillRect(x1, y1, width+1, height+1);
		/*
		g.setColor(Color.YELLOW);
		g.drawRect(x1+10, y1+10, width-20, height-20);



		g.setColor(Color.MAGENTA);
		g.drawLine(getWidth(), 0, 0,getHeight());

		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(getWidth()/2-ovalWidth/2, getHeight()/2 - ovalHeigth/2, ovalWidth, ovalHeigth);


		Polygon p = new Polygon();
        p.addPoint(x1 + 5, y1 + 25);
        p.addPoint(x1 + 20, y1 + 10);
        p.addPoint(x1 + 35, y1 + 25);
        p.addPoint(x1 + 25, y1 + 25);
        p.addPoint(x1 + 25, y1 + 45);
        p.addPoint(x1 + 15, y1 + 45);
        p.addPoint(x1 + 15, y1 + 25);
        g.setColor(Color.YELLOW);
        g.fillPolygon(p);*/

		Polygon p4 = new Polygon();
		p4.addPoint(x1+1, y1+1);
		p4.addPoint(x1+getWidth()-1, 0+1);
		p4.addPoint(x1+getWidth()-1, y1+30);
		p4.addPoint(0, y1+30);
		g.setColor(Color.RED);
		g.fillPolygon(p4);
		
		Polygon p5 = new Polygon();
		p5.addPoint(x1+1, y1+30);
		p5.addPoint(x1+getWidth()-1, 30);
		p5.addPoint(x1+getWidth()-1, y1+60);
		p5.addPoint(0, y1+60);
		g.setColor(Color.WHITE);
		g.fillPolygon(p5);
		
		Polygon p6 = new Polygon();
		p6.addPoint(x1+1, y1+60);
		p6.addPoint(x1+getWidth()-1, 60);
		p6.addPoint(x1+getWidth()-1, y1+90);
		p6.addPoint(0, y1+90);
		g.setColor(Color.RED);
		g.fillPolygon(p6);
		
		Polygon p7 = new Polygon();
		p7.addPoint(x1+1, y1+90);
		p7.addPoint(x1+getWidth()-1, 90);
		p7.addPoint(x1+getWidth()-1, y1+120);
		p7.addPoint(0, y1+120);
		g.setColor(Color.WHITE);
		g.fillPolygon(p7);
		
		Polygon p8 = new Polygon();
		p8.addPoint(x1+1, y1+120);
		p8.addPoint(x1+getWidth()-1, 120);
		p8.addPoint(x1+getWidth()-1, y1+149);
		p8.addPoint(0, y1+149);
		g.setColor(Color.RED);
		g.fillPolygon(p8);

		Polygon p3 = new Polygon();
		p3.addPoint(x1+1, y1+1);
		p3.addPoint(x2/2, y2/2);
		p3.addPoint(1, getHeight()-1);
		g.setColor(Color.BLUE);
		g.fillPolygon(p3);



		Polygon p2 = new Polygon();
		p2.addPoint(x1 + 25, y1 + 73);
		p2.addPoint(x1 + 41, y1 + 73);
		p2.addPoint(x1 + 47, y1 + 58);
		p2.addPoint(x1 + 53, y1 + 73);
		p2.addPoint(x1 + 69, y1 + 73);
		p2.addPoint(x1 + 56, y1 + 83);
		p2.addPoint(x1 + 61, y1 + 98);
		p2.addPoint(x1 + 47, y1 + 88);
		p2.addPoint(x1 + 34, y1 + 98);
		p2.addPoint(x1 + 38, y1 + 83);
		g.setColor(Color.WHITE);
		g.fillPolygon(p2);


	}
}