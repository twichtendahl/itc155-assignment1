package assignment1;

import java.awt.Color;
import java.awt.Graphics;

public class RubberDucky {

	public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(280, 190);
        Graphics g = panel.getGraphics();
        
        // set background to yellow
        panel.setBackground(Color.YELLOW);
        
        // create blue circular "eyes"
        g.setColor(Color.BLUE);
        g.fillOval(65, 35, 46, 46);
        g.fillOval(165, 35, 46, 46);
        
        // create rectangular red "beak"
        g.setColor(Color.RED);
        g.fillRect(90, 60, 100, 100);
        
        // draw "beak" division
        g.setColor(Color.BLACK);
        g.drawLine(90, 110, 190, 110);      
        
    }
}
