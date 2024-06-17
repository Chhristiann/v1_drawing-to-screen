import java.awt.*;
import javax.swing.*;

public class Window extends JFrame {
    private Panel panel;

    Window(){
        panel = new Panel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    // - - - [ Class level methods
}
