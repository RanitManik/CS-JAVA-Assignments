class LocalStudent {
    String name;
    int roll;
    float marks;

    void getData() {
        this.roll = 34;
        this.marks = 5100;
        this.name = "Ranit Manik";
    }

    void getData(int roll, float marks, String name) {
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }

    void printData() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Roll: " + this.roll);
        System.out.println("Student Marks: " + this.marks);
    }

    public static void main(String[] args) {
        LocalStudent student1 = new LocalStudent();
        student1.getData();
        student1.printData();

        LocalStudent student2 = new LocalStudent();
        student2.getData(05, 90.9f, "Soumen Tunga");
        student2.printData();
    }
}
