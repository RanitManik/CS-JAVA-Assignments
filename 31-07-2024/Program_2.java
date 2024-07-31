class NewStudent {
    String name;
    int roll;
    float marks;

    void setData(int roll, float marks, String name) {
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
        NewStudent student1 = new NewStudent();
        student1.setData(14, 52.5f, "Ranit Manik");

        NewStudent student2 = new NewStudent();
        student2.setData(05, 90.9f, "Soumen Tunga");

        student1.printData();
        student2.printData();
    }
}
