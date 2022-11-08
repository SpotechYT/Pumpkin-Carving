import java.awt.Color;
import java.awt.Graphics;

public class Pumpkin  {

	
	public void paint(Graphics g) {
		g.setColor(Color.orange);
		int x[] = {450, 500, 500, 600, 750, 825, 825, 800, 750, 675, 575, 475, 375, 275, 200, 150, 125, 125, 200, 375, 450};
		int y[] = {  0,   0,  75,  50,  75, 125, 325, 400, 525, 600, 600, 575, 600, 600, 525, 400, 325, 125,  75,  50,  75};
		g.fillPolygon(x, y, x.length);

		//Eye Left Black
		g.setColor(Color.black);
		int x2[] = {225, 375, 375, 400, 400, 375, 375, 350, 350, 325, 325, 275, 275, 325, 325, 225, 225, 175, 175, 150, 150, 175, 175, 225, 225};
		int y2[] = {100, 100, 125, 125, 225, 225, 275, 275, 300, 300, 325, 325, 300, 300, 275, 275, 250, 250, 225, 225, 150, 150, 125, 125, 100};
		g.fillPolygon(x2, y2, x2.length);

		//Eye Left White
		g.setColor(Color.blue);
		int x3[] = {275, 325, 325, 275};
		int y3[] = {175, 175, 225, 225};
		g.fillPolygon(x3, y3, x3.length);

		//Eye Right Black
		g.setColor(Color.black);
		int x4[] = {575, 725, 725, 775, 775, 800, 800, 775, 775, 725, 725, 625, 625, 675, 675, 625, 625, 600, 600, 575, 575, 550, 550, 575, 575};
		int y4[] = {100, 100, 125, 125, 150, 150, 225, 225, 250, 250, 275, 275, 300, 300, 325, 325, 300, 300, 275, 275, 225, 225, 125, 125, 100};
		g.fillPolygon(x4, y4, x4.length);

		//Eye Right White
		g.setColor(Color.white);
		int x5[] = {625, 675, 675, 625};
		int y5[] = {175, 175, 225, 225};
		g.fillPolygon(x5, y5, x5.length);

		//Nose
		g.setColor(Color.black);
		int x6[] = {450, 500, 500, 525, 525, 425, 425, 450, 450};
		int y6[] = {225, 225, 275, 275, 350, 350, 275, 275, 225};
		g.fillPolygon(x6, y6, x6.length);

		//Mouth Black
		g.setColor(Color.black);
		int x7[] = {225, 250, 250, 275, 275, 325, 325, 650, 650, 700, 700, 725, 725, 750, 750, 775, 775, 725, 725, 700, 700, 675, 675, 650, 650, 600, 600, 375, 375, 325, 325, 275, 275, 250, 250, 225, 225, 175, 175, 225, 225};
		int y7[] = {325, 325, 350, 350, 375, 375, 400, 400, 375, 375, 325, 325, 350, 350, 375, 375, 400, 400, 425, 425, 450, 450, 475, 475, 500, 500, 525, 525, 500, 500, 475, 475, 450, 450, 425, 425, 400, 400, 375, 375, 325};
		g.fillPolygon(x7, y7, x7.length);

		//Mouth White A
		g.setColor(Color.white);
		int x8[] = {250, 275, 275, 250};
		int y8[] = {375, 375, 425, 425};
		g.fillPolygon(x8, y8, x8.length);

		//Mouth White B
		g.setColor(Color.white);
		int x9[] = {300, 325, 325, 375, 375, 325, 325, 300, 300};
		int y9[] = {400, 400, 425, 425, 475, 475, 450, 450, 400};
		g.fillPolygon(x9, y9, x9.length);

		//Mouth White C
		g.setColor(Color.white);
		int x10[] = {400, 450, 450, 400};
		int y10[] = {425, 425, 500, 500};
		g.fillPolygon(x10, y10, x10.length);

		//Mouth White D
		g.setColor(Color.white);
		int x11[] = {475, 550, 550, 475};
		int y11[] = {425, 425, 500, 500};
		g.fillPolygon(x11, y11, x11.length);

		//Mouth White E
		g.setColor(Color.white);
		int x12[] = {575, 625, 625, 600, 600, 575, 575};
		int y12[] = {425, 425, 475, 475, 500, 500, 425};
		g.fillPolygon(x12, y12, x12.length);

		//Mouth White F
		g.setColor(Color.white);
		int x13[] = {650, 675, 675, 650};
		int y13[] = {400, 400, 450, 450};
		g.fillPolygon(x13, y13, x13.length);
	}
	
	public Pumpkin() {

	}
	 
	 
}
