import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    Image image;

    Panel(){

        image = new ImageIcon("sky.png").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }

    // - - - [ Class level methods
    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(image, 0, 0, null);// Background
        g2D.setStroke(new BasicStroke(5));
        //g2D.setPaint(Color.RED);

        //Simple stuff
        //g2D.drawLine(0, 0, 500, 500);
        //g2D.setPaint(Color.BLUE);
        //g2D.drawRect(0, 0 ,100, 200);
        //g2D.setPaint(Color.GREEN);
        //g2D.fillRect(0, 0, 100, 200);

        //g2D.setPaint(Color.ORANGE);
        //g2D.fillOval(100, 100, 100, 100);

        // Practice Draw Pokeball
        g2D.setPaint(Color.RED);
        g2D.fillArc(200, 200, 100, 100, 0, 180);
        g2D.setPaint(Color.WHITE);
        g2D.fillArc(200, 200, 100, 100, 180, 180);
        g2D.setPaint(Color.BLACK);
        g2D.drawOval(200, 200, 100, 100);
        g2D.fillOval(235, 235, 30, 30);
        g2D.drawLine(200, 250, 300, 250);
        g2D.setPaint(Color.BLUE);
        g2D.fillOval(240, 240, 20, 20);

        g2D.setPaint(Color.BLACK);
        g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
        g2D.drawString("U R Cool Man! :D", 50, 50);

        g2D.
    }
}
