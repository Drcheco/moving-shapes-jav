import java.awt.*;

public class Circle extends Shape implements Moveable {
    private double radius;
    private int direction = 1;

    public Circle(int x, int y, Color c, double radius) {
        super(x, y, c);
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), (int)(radius * 2), (int)(radius * 2));
    }

    public void tick() {
        if (getY() <= 0) {
            direction = 1;
        }
        if (getY() >= 380) {
            direction = -1;
        }
        setY(Math.max(0, Math.min(380, getY() + direction * 3)));
    }
}