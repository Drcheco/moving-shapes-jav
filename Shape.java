import java.awt.*;

public abstract class Shape {

    private int x;
    private int y;
    private Color c;

    public Shape(int x,int y,Color c) {
        this.x = x;
        this.y = y;
        this.c = c;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return c;
    }

    public void setColor(Color c) {
        this.c = c;
    }

    public abstract double area();

    public abstract double perimeter();

    public abstract void draw(Graphics g);

}
