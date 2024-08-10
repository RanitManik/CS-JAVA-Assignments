class Shape {
    double calc_perimeter() {
        return 0;
    }

    double calc_area() {
        return 0;
    }

	public static void main(String[] args) {
	    Circle circle = new Circle(5);
	    System.out.println("Circle Perimeter: " +
                circle.calc_perimeter());
	    System.out.println("Circle Area: " +
                circle.calc_area());

	    Rectangle rectangle = new Rectangle(4, 6);
	    System.out.println("Rectangle Perimeter: " +
                rectangle.calc_perimeter());
	    System.out.println("Rectangle Area: " +
                rectangle.calc_area());
	}

}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calc_perimeter() {
        return 2 * Math.PI * radius;
    }

    double calc_area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double calc_perimeter() {
        return 2 * (length + breadth);
    }

    double calc_area() {
        return length * breadth;
    }
}

