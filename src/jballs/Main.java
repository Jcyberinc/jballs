package jballs;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

import jballs.display.BallContainer;

public class Main {
	
	public static String version_string = "jballs 0.0003";

	public static void main(String[] args) {
		System.out.println(version_string);
        JFrame f = new JFrame(version_string);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });
        BallContainer panel = new BallContainer();
        f.getContentPane().add("Center", panel);
        panel.init();
        f.pack();
        f.setSize(new Dimension(500,500));
        f.setVisible(true);
	}

}

