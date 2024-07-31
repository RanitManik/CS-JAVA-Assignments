class AreaCalculation {
    void area(int r) {
        float pi = 3.14f;
        System.out.println("Area of the circle: " + (pi * r * r));
    }

    void area(float length, float breadth) {
        System.out.println("Area of the rectangle: " + (length * breadth));
    }

    void area(float length, float breadth, float height) {
        System.out.println("Area of the cuboid: " + (2 * (length * breadth + breadth * height + length * height)));
    }

    public static void main(String[] args) {
        AreaCalculation areaCalc = new AreaCalculation();
        areaCalc.area(7);
        areaCalc.area(4.5f, 4);
        areaCalc.area(3, 2, 4);
    }
}
