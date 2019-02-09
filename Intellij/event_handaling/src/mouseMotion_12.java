import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
public class mouseMotion_12 extends Applet implements MouseMotionListener, MouseListener {
    String text;
    @Override
    public void paint(Graphics g) {
        g.drawString(text, 150, 150);
    }
    @Override
    public void init() {
        addMouseMotionListener(this);
        addMouseListener(this);
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        text = "Mouse Dragged.";
        repaint();
        System.out.println("Mouse Draged");
        repaint();
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        text = "Mouse Moved.";
        repaint();
        System.out.println("Mouse Moved");
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        text = "Mouse Clicked.";
        repaint();
        System.out.println("Mouse Clicked");
    }
    @Override
    public void mousePressed(MouseEvent e) {
        text = "Mouse Pressed.";
        repaint();
        System.out.println("Mouse Pressed");
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        text = "Mouse Reseased.";
        repaint();
        System.out.println("Mouse Released");
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        text = "Mouse Entered.";
        repaint();
        System.out.println("Mouse Entered");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        text = "Mouse Exited.";
        repaint();
        System.out.println("Mouse Exited");
    }
}
