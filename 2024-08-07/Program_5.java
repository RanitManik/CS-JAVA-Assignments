class Person {
    String name;
    String address;
    int age;

    Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        ExStudent exStudent =
                new ExStudent(
                        "Ranit Kumar Manik", "Mecheda", 25,
                        "CSE/22/014", "Computer Science",
                        "GitHub", "ranitmanik@gmail.com");
        CurrentStudent currentStudent =
                new CurrentStudent(
                        "Soumen Tunga", "Mahisadal",
                        20, "CSE/22/05", "IT", 5, 6.2);
        Faculty faculty =
                new Faculty(
                        "Dr. Haldiram Haldar", "441 Kolkata Street",
                        40, "Physics", "Quantum Mechanics");

        System.out.println("ExStudent Details:");
        exStudent.display();
        System.out.println();

        System.out.println("CurrentStudent Details:");
        currentStudent.display();
        System.out.println();

        System.out.println("Faculty Details:");
        faculty.display();
    }

}

class Student extends Person {
    String roll;
    String department;

    Student(
            String name,
            String address,
            int age,
            String roll,
            String department) {
        super(name, address, age);
        this.roll = roll;
        this.department = department;
    }

    void display() {
        super.display();
        System.out.println("Roll: " + roll);
        System.out.println("Department: " + department);
    }
}

class Faculty extends Person {
    String majorSubject;
    String publication;

    Faculty(
            String name,
            String address,
            int age,
            String majorSubject,
            String publication) {
        super(name, address, age);
        this.majorSubject = majorSubject;
        this.publication = publication;
    }

    void display() {
        super.display();
        System.out.println("Major Subject: " + majorSubject);
        System.out.println("Publication: " + publication);
    }
}

class ExStudent extends Student {
    String organizationName;
    String officeEmail;

    ExStudent(
            String name,
            String address,
            int age,
            String roll,
            String department,
            String organizationName,
            String officeEmail) {
        super(name, address, age, roll, department);
        this.organizationName = organizationName;
        this.officeEmail = officeEmail;
    }

    void display() {
        super.display();
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Office Email: " + officeEmail);
    }
}

class CurrentStudent extends Student {
    int semester;
    double sgpa;

    CurrentStudent(
            String name,
            String address,
            int age,
            String roll,
            String department,
            int semester,
            double sgpa) {
        super(name, address, age, roll, department);
        this.semester = semester;
        this.sgpa = sgpa;
    }

    void display() {
        super.display();
        System.out.println("Semester: " + semester);
        System.out.println("SGPA: " + sgpa);
    }
}
