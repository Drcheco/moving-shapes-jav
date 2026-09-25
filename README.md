# Moving Shapes (Java)

A beginner Java Swing project that draws and animates a rectangle, triangle, and circle in a window.

## What it demonstrates

- An abstract `Shape` class shared by three shapes
- A `Moveable` interface for animation
- Drawing with Java Swing and AWT
- A Swing timer that updates positions and repaints the window
- Area and perimeter methods for each shape

## Run it

You need a JDK and a desktop environment that can display a Swing window. In a terminal from this repository's folder:

```bash
javac *.java
java Main
```

The rectangle moves horizontally, the circle moves vertically, and the triangle follows a circular path.

## Files

- `Main.java`: creates the window, timer, and drawing panel
- `Shape.java`: common properties and abstract methods
- `Moveable.java`: animation interface
- `Rectangle.java`, `Circle.java`, `Triangle.java`: shape behavior
