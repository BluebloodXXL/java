import java.applet.Applet;
import java.awt.*;

public class human_face extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawOval(40, 40, 120, 150); // head


        g.fillOval(65, 81, 25, 30); // left pupil
        g.fillOval(117, 81, 25, 30); // right pupil

        g.drawRect(97, 110, 10, 15); // nose
        g.fillRect(97, 110, 10, 15); // nose


        g.fillArc(60, 125, 80, 40, 180, 180); // mouth

        g.fillOval(25, 92, 15, 13); // left ear
        g.fillOval(160, 92, 15, 13); // right ear
    }
}