package java_sessional;
import java.applet.*;
import java.awt.*;

public class human_face extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawOval(40, 40, 120, 150); // head
        g.drawOval(57, 75, 30, 20); // left eye
        g.drawOval(110, 75, 30, 20); // right eye

        g.fillOval(68, 81, 10, 10); // left pupil
        g.fillOval(120, 81, 10, 10); // left pupil

        g.drawOval(85, 100, 30, 30); // nose
        g.fillArc(60, 125, 80, 40, 180, 180); // mouth

        g.drawOval(25, 92, 15, 30); // left ear
        g.drawOval(160, 92, 15, 30); // right ear
    }
}