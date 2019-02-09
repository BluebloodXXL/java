import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class myframe extends Frame implements ActionListener {

    Label l_1;
    Label l_2;
    Button b_1;

    public myframe(){
        FlowLayout f = new FlowLayout();
        setLayout(f);
        l_1 = new Label("Hello");
        l_2 = new Label("Hi Bye Bye");
        b_1 = new Button("Click here baby !");
        add(l_1);
        add(l_2);
        add(b_1);
        b_1.addActionListener(this);
        setVisible(true);
        setSize(640,480);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Ok, You have clicked the button successfully !");
    }
}

public class gui_1st_test {
    public static void main(String[] args) {
        new myframe();
    }
}
