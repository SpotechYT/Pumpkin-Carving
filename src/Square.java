import java.awt.*;

public class Square { //class header
    //A class is a template for creating objects
    //objects - a blueprint/template

    //properties - instance variables
    private int length;
    private Color c;
    private int x; //location top-left x
    private int y; //location top-left y

    public Square(){
        length = 1;
        c = Color.blue;
        x = 0;
        y = 0;
    }
    public void paint(Graphics g){
        g.setColor(c);
        g.fillRect(x, y, length, length);
    }
    public double getArea(){
        return Math.pow(length, 2);
    }
}
