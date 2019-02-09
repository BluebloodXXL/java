import javax.swing.*;
import java.awt.*;

public class button_demo {
    public static void main(String[] args) {
        ButtonDemo buttonDemo = new ButtonDemo("Button Demo");
        buttonDemo.setSize(400, 200);
        buttonDemo.setVisible(true);
    }
}


class ButtonDemo extends JFrame {
    JButton b;

    ButtonDemo(String title) {
        super(title);
        setLayout(new FlowLayout());
        b = new JButton("Click Me!");
        add(b);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}