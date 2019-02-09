import java.applet.Applet;
import java.awt.*;

public class set_4ground_background extends Applet {
    @Override
    public void init() {
        setBackground(Color.GREEN);
        setForeground(Color.RED);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("I Love Biriyani", 300, 200);
    }
}