package vehiclemanagement;

public abstract class Vehicle implements Rentable, Serviceable, Insurable {
   
    // Common attributes for all vehicles
    private int vehicleId;
    private String brand;
    private double rentPerDay;
    private boolean isAvailable;

    private String vehicleNumber;
    private String color;
    private int modelYear;
    private double totalDistance;

    private Engine engine; 

   // Constructor to initialize common attributes
public Vehicle(int vehicleId,
               String brand,
               double rentPerDay,
               boolean isAvailable,
               String vehicleNumber,
               String color,
               int modelYear,
               double totalDistance,
               Engine engine) 
               
               {
                this.vehicleId = vehicleId;
                this.brand = brand;
                this.rentPerDay = rentPerDay;
                this.isAvailable = isAvailable;
                this.vehicleNumber = vehicleNumber;
                this.color = color;
                this.modelYear = modelYear;
                this.totalDistance = totalDistance;
                this.engine = engine;

               } 

     // Common methods for all vehicles   
    public void startVehicle(){
        System.out.println("Vehicle started");
    }

    public void stopVehicle(){
        System.out.println("Vehicle stopped");
    }

    public void rentVehicle(){
        if(isAvailable){
            System.out.println("Vehicle rented successfully");
            isAvailable = false;
        } else {
            System.out.println("Vehicle is not available for rent");
        }
    }

    public void returnVehicle(){
        System.out.println("Vehicle returned successfully");
        isAvailable = true;
    }

    public void updateTotalDistance(double distance){
        totalDistance += distance;
    }

    public void displayVehicleInfo(){
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Rent per day: " + rentPerDay);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Color: " + color);
        System.out.println("Model Year: " + modelYear);
        System.out.println("Total Distance: " + totalDistance);
        engine.displayEngineInfo();
    } 
    
    // Abstract methods to be implemented by subclasses
    public abstract Double calculateRent(int days);
    public abstract void performMaintenance();
    public abstract void displayVehicleDetails();  
    
    public static void companyPolicy(){
        System.out.println("Company policy: All vehicles must be returned with a full tank of fuel.");
    }

    public double calculateInsurancePremium(){
        double premium = rentPerDay * 0.1; // Example insurance premium calculation
        System.out.println("Insurance Premium: $" + premium);
        return premium;
    }

    public void displayInsuranceDetails(){
        System.out.println("Insurance details for vehicle: " + brand);
        calculateInsurancePremium();
    }

    // Getters and Setters 
    public int getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }   

    public double getRentPerDay() {
        return rentPerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getColor() {
        return color;
    }

    public int getModelYear() {
        return modelYear;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public Engine getEngine() {
        return engine;
    }

    
}
