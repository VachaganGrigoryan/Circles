import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class CirclesPanel extends JPanel
{
    public CirclesPanel () {
        setBackground (Color.red);
        setPreferredSize (new Dimension (500, 500));
    }

    public void paintComponent(Graphics page) {

        super.paintComponent (page);

        page.setColor(Color.blue);
        page.fillOval(100, 100, 300, 300);
        repaint();
    }
}
