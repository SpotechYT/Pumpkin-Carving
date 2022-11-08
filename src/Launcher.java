import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Launcher extends JPanel implements KeyListener, ActionListener {

	//create a Ball object
	Pumpkin pumpkin = new Pumpkin();
	Background bg = new Background("bg.jpg");
	Timer t;
    Square mySquare = new Square();
    Circle myCircle = new Circle();
    
           
    /* paint is getting called roughly 60x per second */
    public void paint(Graphics g) {
        super.paintComponent(g);
        bg.paint(g);
        pumpkin.paint(g);
        mySquare.paint(g);
        myCircle.paint(g);
    }
   
   
    public void keyPressed(KeyEvent arg0) {
        System.out.println(arg0.getKeyCode());
        
    }


    public void keyReleased(KeyEvent arg0) {
        System.out.println(arg0.getKeyCode());
       
      
    }


    public void keyTyped(KeyEvent arg0) {
       
       
    }
    
    
    
    //Frame Setup code below ---------------------------------
    public static void main(String[] arg) {
    	Launcher p = new Launcher();
    }
    
    public Launcher() {
    	//Name of title bar of the GUI
    			JFrame f = new JFrame("Digital Pumpkin Carving");
    			
    			//makes sure that the program stops when the window is close
    			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //don't delete
    			
    			//GUI dimensions - width - height
    			f.setSize(900,700);
    			
    			
    			f.add(this);
    			f.addKeyListener(this);
    			
    			t = new Timer(16, this);
    			t.start();
    			f.setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}
   
}