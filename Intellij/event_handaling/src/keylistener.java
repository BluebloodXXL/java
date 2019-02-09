import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keylistener {
    public static void main(String[] args) {
        KeyListenerDemo frame = new KeyListenerDemo("Key Listener Demo");
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
class KeyListenerDemo extends JFrame implements KeyListener {
    JTextArea t;

    KeyListenerDemo(String title) {
        super(title);

        setLayout(new FlowLayout());
        t = new JTextArea();
        t.setBounds(10, 20, 300, 200);
        add(t);
        t.addKeyListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        t.setText(e.getKeyChar() + " is typed.");
    }
    @Override
    public void keyPressed(KeyEvent e) {
        t.setText(e.getKeyChar() + " is pressed.");
    }
    @Override
    public void keyReleased(KeyEvent e) {
        t.setText(e.getKeyChar() + " is released.");
    }
}