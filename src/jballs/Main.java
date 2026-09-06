package jballs;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JApplet;
import javax.swing.JFrame;

import jballs.display.BallContainer;

public class Main {

	public static void main(String[] args) {
		System.out.println("jballs 0.0002");
        JFrame f = new JFrame("jballs 0.0002");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });
        JApplet applet = new BallContainer();
        f.getContentPane().add("Center", applet);
        applet.init();
        f.pack();
        f.setSize(new Dimension(500,500));
        f.setVisible(true);
	}

}

