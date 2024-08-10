class Vehicle {
    // Instance Variables =>
    String regNo;
    String companyName;
    double price;

    // Contstructor =>
    Vehicle(String regNo, String companyName, double price) {
        this.regNo = regNo;
        this.companyName = companyName;
        this.price = price;
    }

    void getData(String regNo, String companyName, double price) {
        this.regNo = regNo;
        this.companyName = companyName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Registration No: " + regNo);
        System.out.println("Company Name: " + companyName);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        LightMotorVehicle lightVehicle =
                new LightMotorVehicle("", "", 0, 0);
        lightVehicle.getData("LMV123", "Fiat", 1000, 15.9);
        lightVehicle.displayDetails();

        HeavyMotorVehicle heavyVehicle =
                new HeavyMotorVehicle("", "", 0, 0);
        heavyVehicle.getData("HMV456", "Lamborgini", 500000, 50);
        heavyVehicle.displayDetails();
    }
}

class LightMotorVehicle extends Vehicle {
    double mileage;

    LightMotorVehicle(
            String regNo,
            String companyName,
            double price,
            double mileage
    ) {
        super(regNo, companyName, price);
        this.mileage = mileage;
    }

    void getData(
            String regNo,
            String companyName,
            double price,
            double mileage) {
        super.getData(regNo, companyName, price);
        this.mileage = mileage;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Mileage: " + mileage);
    }
}

class HeavyMotorVehicle extends Vehicle {
    double capacity;

    HeavyMotorVehicle(
            String regNo,
            String companyName,
            double price,
            double capacity) {
        super(regNo, companyName, price);
        this.capacity = capacity;
    }

    void getData(
            String regNo,
            String companyName,
            double price,
            double capacity) {
        super.getData(regNo, companyName, price);
        this.capacity = capacity;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Capacity: " + capacity + " tons");
    }
}
