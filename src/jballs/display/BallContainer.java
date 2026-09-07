package jballs.display;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class BallContainer extends JPanel{
    final static Color bg = Color.white;
    final static Color fg = Color.black;
    
    public void init() {
        //Initialize drawing colors
        setBackground(bg);
        setForeground(fg);
    }


    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.white);
        g2.fill3DRect(0, 0, 499, 499, true);
        g2.setPaint(Color.MAGENTA);
        g2.drawString(jballs.Main.version_string, 67, 67);
    }
}
