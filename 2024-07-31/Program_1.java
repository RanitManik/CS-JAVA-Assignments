class Student {
    int age;
    String name;
    String city;

    void setData(int age, String city, String name) {
        this.age = age;
        this.city = city;
        this.name = name;
    }

    void printData() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student City: " + this.city);
        System.out.println("Student Age: " + this.age);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setData(19, "Mecheda", "Ranit Manik");

        Student student2 = new Student();
        student2.setData(21, "Kolkata", "Soumen Tunga");

        student1.printData();
        student2.printData();
    }
}
