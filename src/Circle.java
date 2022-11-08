import java.awt.*;

public class Circle {
    private int radius;
    private Color c;
    private int x;
    private int y;

    public Circle(){
        radius = 1;
        c = Color.blue;
        x = 0;
        y = 0;
    }

    public void paint(Graphics g){
        g.setColor(c);
        g.fillOval(x, y, radius, radius);
    }
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
}
