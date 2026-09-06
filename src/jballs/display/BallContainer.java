package jballs.display;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JApplet;

@SuppressWarnings("removal")
public class BallContainer extends JApplet{
    final static Color bg = Color.white;
    final static Color fg = Color.black;
    
    public void init() {
        //Initialize drawing colors
        setBackground(bg);
        setForeground(fg);
    }


    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawString("jballs 0.0002", 67, 67);
    }
}
