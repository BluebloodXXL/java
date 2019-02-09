import javax.swing.*;
import java.awt.*;

public class gridlayout_demo {
        public static void main(String[] args) {
            GridLayoutDemo frame = new GridLayoutDemo("Grid Layout Demo");
            frame.setSize(400, 200);
            frame.setVisible(true);
        }
    }


class GridLayoutDemo extends JFrame {
    int row;
    int col;
    GridLayoutDemo(String title) {
        super(title);
        row = 4;
        col = 4;
        setLayout(new GridLayout(row, col));
        setFont(new Font("SansSerif", Font.BOLD, 24));
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int k = i * row + j;
                if (k > 0) {
                    add(new JButton("" + k));
                }
            }
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}