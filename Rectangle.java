class Rectangle {
    int length, breadth;

    Rectangle() {
        length = 0;
        breadth = 0;
    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
        System.out.println("Area = " + (length * breadth));
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(15,60);
        Rectangle r2 = new Rectangle(5, 10);
    }
}
