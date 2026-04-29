class Shape {
    void calculateArea() {}
}

class Circle extends Shape {
    double r;

    Circle(double radius) { r = radius; }

    void calculateArea() {
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }
}

class Rect extends Shape {
    int l, b;

    Rect(int x, int y) { l = x; b = y; }

    void calculateArea() {
        System.out.println("Area of Rectangle = " + (l * b));
    }

    public static void main(String[] args) {
        new Circle(5).calculateArea();
        new Rect(4, 6).calculateArea();
    }
}
