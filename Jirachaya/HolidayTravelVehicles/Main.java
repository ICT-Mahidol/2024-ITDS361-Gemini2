

// Invoice class
import java.util.List;
// Person class
class Person {
    String name;
    String address;
    String phoneNumber;

    public Person(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}

// Customer class
class Customer extends Person {
    public Customer(String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
    }
    
    public void selectVehicle(String name) {
        System.out.println("Customer selects vehicle: " + name);
    }
}

// Salesperson class
class Salesperson extends Person {
    String salespersonID;

    public Salesperson(String name, String address, String phoneNumber, String salespersonID) {
        super(name, address, phoneNumber);
        this.salespersonID = salespersonID;
    }
    
    public Vehicle lookUpVehicle(String serialNumber) {
        System.out.println("Looking up vehicle with serial number: " + serialNumber);
        return new Vehicle(serialNumber, "Sample Car", "Sedan", 2023, "Brand", 25000.0);
    }
    
    public void informationNegotiation() {
        System.out.println("Negotiation process in progress...");
    }
}

class Invoice {
    String customerInfo;
    Vehicle vehicle;
    TradeInVehicle tradeInVehicle;
    double tradeInAllowance;
    List<DealerInstalledOptions> dealerOptions;
    double finalPrice;
    double tax;
    double registrationTax;

    public Invoice(String customerInfo, Vehicle vehicle, TradeInVehicle tradeInVehicle, double tradeInAllowance, List<DealerInstalledOptions> dealerOptions, double finalPrice, double tax, double registrationTax) {
        this.customerInfo = customerInfo;
        this.vehicle = vehicle;
        this.tradeInVehicle = tradeInVehicle;
        this.tradeInAllowance = tradeInAllowance;
        this.dealerOptions = dealerOptions;
        this.finalPrice = finalPrice;
        this.tax = tax;
        this.registrationTax = registrationTax;
    }

    public void negotiatePrice(double newPrice) {
        this.finalPrice = newPrice;
    }

    public double calculateTax() {
        return this.finalPrice * 0.07; // Assume 7% tax
    }
}

// Vehicle class
class Vehicle {
    String serialNumber;
    String name;
    String model;
    int year;
    String manufacturer;
    double baseCost;

    public Vehicle(String serialNumber, String name, String model, int year, String manufacturer, double baseCost) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    public void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Base Cost: $" + baseCost);
    }
}

// DealerInstalledOptions class
class DealerInstalledOptions {
    String optionCode;
    String description;
    double price;

    public DealerInstalledOptions(String optionCode, String description, double price) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }
}

// TradeInVehicle class
class TradeInVehicle {
    String serialNumber;
    String make;
    String model;
    int year;
    double tradeInAllowance;

    public TradeInVehicle(String serialNumber, String make, String model, int year, double tradeInAllowance) {
        this.serialNumber = serialNumber;
        this.make = make;
        this.model = model;
        this.year = year;
        this.tradeInAllowance = tradeInAllowance;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "123 Main St", "555-1234");
        Salesperson salesperson = new Salesperson("Jane Smith", "456 Market St", "555-5678", "SP001");

        customer.selectVehicle("Toyota Corolla");
        Vehicle vehicle = salesperson.lookUpVehicle("12345");
        salesperson.informationNegotiation();

        vehicle.displayInfo();
    }
}
