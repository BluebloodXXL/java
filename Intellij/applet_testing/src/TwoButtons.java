import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons extends Applet implements ActionListener {
    Button ON;
    Button OFF;
    String message;
    @Override
    public void init() {
        setBackground(Color.WHITE);

        ON = new Button("ON");
        OFF = new Button("OFF");

        add(ON);
        add(OFF);

        ON.addActionListener(this);
        OFF.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();

        if (str.equals("ON")) {
            message = "ON is clicked!";
        }
        else if (str.equals("OFF")) {
            message = "OFF is clicked!";
        }
        repaint();
    }
    @Override
    public void paint(Graphics g) {
        g.drawString(message, 100, 300);
    }
}