import java.awt.*;

public class Rectangle extends Shape implements Moveable {
    private int width;
    private int height;
    private int direction = 1;

    public Rectangle(int x, int y, Color c, int width, int height) {
        super(x, y, c);
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), width, height);
    }

    public void tick() {
        if (getX() <= 0) {
            direction = 1;
        }
        if (getX() >= 460) {
            direction = -1;
        }
        setX(getX() + direction * 3);
    }
}