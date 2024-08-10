class Staff {
    // instance variables =>
    String name;
    String address;

    // constructor =>
    Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        FullTimeStaff fullTimeStaff =
                new FullTimeStaff(
                        "Ranit Manik", "123 Mecheda Street",
                        "Web Developer", 60000);
        PartTimeStaff partTimeStaff =
                new PartTimeStaff(
                        "Soumen Tunga", "456 Kolkata Street",
                        20, 15);

        fullTimeStaff.displayDetails();
        System.out.println();
        partTimeStaff.displayDetails();
    }

}

class FullTimeStaff extends Staff {
    String department;
    double salary;

    FullTimeStaff(
            String name,
            String address,
            String department,
            double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("FullTimeStaff");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class PartTimeStaff extends Staff {
    int number_of_hours;
    double rate_per_hour;

    PartTimeStaff(
            String name,
            String address,
            int number_of_hours,
            double rate_per_hour) {
        super(name, address);
        this.number_of_hours = number_of_hours;
        this.rate_per_hour = rate_per_hour;
    }

    void displayDetails() {
        System.out.println("PartTimeStaff");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Number of Hours: " + number_of_hours);
        System.out.println("Rate per Hour: " + rate_per_hour);
    }
}


