import java.applet.Applet;
import java.awt.*;

public class SmileApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(20,20,150,135);   // For face
        g.setColor(Color.BLACK);
        g.fillOval(55,60,25,25);     // Left Eye
        g.fillOval(115,60,25,25);    // Right Eye

        g.drawArc(55,94,78,49,0,-180);  // Smile

    }
}