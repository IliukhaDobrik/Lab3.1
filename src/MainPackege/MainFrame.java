package MainPackege;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private final int WIDTH = 750;
    private final int HEIGHT = 550;

    MainFrame(){
        setSize(WIDTH,HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setJMenuBar(new MyMenuBar());

        setVisible(true);
    }
}
