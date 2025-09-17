

class Circle {
    private double radius;

    Circle(double r) {
        radius = r;
    }

    double area() { return Math.PI * radius * radius; }

    double perimeter() { return 2 * Math.PI * radius; }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Area : " + c.area());
        System.out.println("Circumference : " + c.perimeter());
    }
}
