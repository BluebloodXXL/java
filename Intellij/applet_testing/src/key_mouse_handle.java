import java.awt.event.*;
import javax.swing.*;

class allHandle implements KeyListener, MouseListener {


    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(e + "key has been typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key released");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited");
    }

}

public class key_mouse_handle {
    public static void main(String[] args) {
        JFrame jf = new JFrame("All_Event");
        jf.setSize(640, 480);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        allHandle hall = new allHandle();
        jf.addMouseListener(hall);
        jf.addKeyListener(hall);

        jf.setVisible(true);
     }
 }