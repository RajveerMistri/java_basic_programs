abstract class Shape {
    abstract void calculateArea();
}

class Circle extends Shape {
    double r;

    Circle(double x) { r = x; }

    void calculateArea() {
        System.out.println("Area = " + (3.14 * r * r));
    }
}

class RectAng extends Shape {
    int l, b;

    RectAng(int x, int y) { l = x; b = y; }

    void calculateArea() {
        System.out.println("Area = " + (l * b));
    }

    public static void main(String[] args) {
        new Circle(5).calculateArea();
        new RectAng(4, 6).calculateArea();
    }
}
