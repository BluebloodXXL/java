import java.applet.Applet;
import java.awt.*;

public class UserInputApplet extends Applet {
    TextField t1;
    TextField t2;
    @Override
    public void init() {
        t1 = new TextField(8);
        t2 = new TextField(8);

        add(t1);
        add(t2);

        t1.setText("0");
        t2.setText("0");
    }
    @Override
    public void paint(Graphics g) {
        int x = 0;
        int y = 0;
        String str;
        g.drawString("Input a number in each box", 10, 50);
        try {
            x = Integer.parseInt(t1.getText());
            y = Integer.parseInt(t2.getText());
        }
        catch (Exception e) {
            // empty
        }
        str = String.valueOf(x + y);
        g.drawString("Sum = " + str, 10, 75);
    }
    @Override
    public boolean action(Event evt, Object what) {
        repaint();
        return true;
    }
}