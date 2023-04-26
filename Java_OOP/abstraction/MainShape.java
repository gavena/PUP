abstract class Shape {
    abstract double getArea();
    abstract double getPerimeter();
}

class Rectangle extends Shape {
    double width;
    double length;
    
    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    double getArea() {
        return width * length;
    }
    
    double getPerimeter() {
        return 2 * (width + length);
    }
}

class Circle extends Shape {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    double getArea() {
        return Math.PI * radius * radius;
    }
    
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class MainShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + s1.getArea());
        System.out.println("Rectangle perimeter: " + s1.getPerimeter());

        Shape s2 = new Circle(2.5);
        System.out.println("Circle area: " + s2.getArea());
        System.out.println("Circle perimeter: " + s2.getPerimeter());
    }
}
