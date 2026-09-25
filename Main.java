import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Motions");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawPanel panel = new DrawPanel();
        frame.add(panel);
        frame.setVisible(true);

        Timer t = new Timer(20, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.tick();
                panel.repaint();
            }
        });
        t.start();
    }
}

class DrawPanel extends JPanel {
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public DrawPanel() {
        setBackground(Color.WHITE);
        shapes.add(new Rectangle(50, 50, Color.RED, 40, 40));
        shapes.add(new Triangle(250, 250, Color.GREEN, 60, 70, 80));
        shapes.add(new Circle(220, 250, Color.ORANGE, 40));
    }

    public void tick() {
        for (int i = 0; i < shapes.size(); i++) {
            Shape s = shapes.get(i);
            if (s instanceof Moveable) {
                ((Moveable) s).tick();
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < shapes.size(); i++) {
            shapes.get(i).draw(g);
        }
    }
}