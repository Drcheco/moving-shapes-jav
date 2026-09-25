import java.awt.*;

public class Triangle extends Shape implements Moveable {

    private double sideA;
    private double sideB;
    private double sideC;
    private double angle = 0;
    private double startx;
    private double starty;

    public Triangle(int x, int y, Color c,double sideA, double sideB, double sideC) {
        super(x, y, c);
        this.startx = x;
        this.starty = y;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        double s = (sideA + sideB + sideC)/2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        Polygon p = new Polygon();
        double max = Math.max(Math.max(sideA,sideB),sideC);
        double min = Math.min(Math.min(sideA,sideB),sideC);
        double middle = sideA + sideB + sideC - max - min;
        p.addPoint(getX(),getY());
        p.addPoint(getX(),(int) (getY()+min));
        p.addPoint((int) (getX() + middle),(int) (getY()+min));
        g.fillPolygon(p);
    }

    @Override
    public void tick() {
  /*
        this.setX(this.getX()+1);
        this.setY((int) (50*Math.sin(angle)) + 100);
        angle = angle + 0.05;
  */
        int radius = 100;
        double dx = radius*Math.cos(angle) + startx;
        double dy = radius*Math.sin(angle) + starty;
        angle = angle + 0.02;
        this.setX((int)dx);
        this.setY((int)dy);


    }
}
