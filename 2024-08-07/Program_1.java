class Employee {
    int empId;
    String name;
    String dob;
    String designation;
    double basicSalary;

    Employee(
            int empId, String name, String dob,
            String designation, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.dob = dob;
        this.designation = designation;
        this.basicSalary = basicSalary;
    }

    void printData() {
        double hra = 0.20 * basicSalary;
        double da = 0.90 * basicSalary;
        double netSalary = basicSalary + hra + da;

        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Net Salary: " + netSalary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1, "Ranit Kumar Manik",
                "2005-05-05", "Web Developer", 50000);
        emp.printData();
    }
}
