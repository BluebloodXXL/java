import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class appletFundamentalMethods extends Applet {
    @Override
    public void init() {
        JOptionPane.showMessageDialog(null, "Applet : Initialized");
    }

    @Override
    public void start() {
        JOptionPane.showMessageDialog(null, "Applet : Started");
    }

    @Override
    public void stop() {
        JOptionPane.showMessageDialog(null, "Applet : Stopped");
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Applet : Running", 200, 300);
    }

    @Override
    public void destroy() {
        JOptionPane.showMessageDialog(null, "Applet : Destroyed");
    }
}