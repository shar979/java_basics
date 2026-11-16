import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {

    // Paint method
    public void paint(Graphics g) {

        // Draw a rectangle
        g.drawRect(50, 50, 150, 100);

        // Draw a circle
        g.drawOval(250, 50, 100, 100);

        // Display a message
        g.drawString("Welcome to Java Applets!", 100, 200);
    }
}




