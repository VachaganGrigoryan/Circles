import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Circles extends JPanel{
    private JButton clickMe;
    public static JFrame frame = new JFrame("Circles");


    public Circles(){
        setLayout(new BorderLayout());

        clickMe = new JButton();
        clickMe.setText("Draw Circles");
        clickMe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Graphics page = frame.getGraphics();
                paintComponent(page);
                page.setColor(Color.blue);
                page.fillOval(100, 100, 300, 300);
            }
        });

        add(clickMe, BorderLayout.SOUTH);
        setPreferredSize(new Dimension(500,500));
        setVisible(true);
    }

    public static void main (String[] args)
    {
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Circles());
        frame.pack();
        frame.setVisible(true);
    }
}
