package vehiclemanagement;

public class Car extends Vehicle {
    private int seatCapacity;
    private String fuelType;
    private boolean automatic;

    private int airBags;
    private String transmissionType;
    private boolean sunRoof;
 
    public Car(int vehicleId,
               String brand,
               double rentPerDay,
               boolean isAvailable,
               String vehicleNumber,
               String color,
               int modelYear,
               double totalDistance,
               Engine engine,
               int seatCapacity,
               String fuelType,
               boolean automatic,
               int airBags,
               String transmissionType,
               boolean sunRoof) 
               
               {
                super(vehicleId, brand, rentPerDay, isAvailable, vehicleNumber, color, modelYear, totalDistance, engine);
                this.seatCapacity = seatCapacity;
                this.fuelType = fuelType;
                this.automatic = automatic;
                this.airBags = airBags;
                this.transmissionType = transmissionType;
                this.sunRoof = sunRoof;
               }

                public Double calculateRent(int days) {
                double rent = getRentPerDay() * days;
                    if(automatic){
                        rent += 50; // Additional charge for automatic cars
                } 
                    return rent;    
                }

                public void performMaintenance() {
                    System.out.println("Performing maintenance for car: " + getBrand());
                    // Maintenance logic here

                }

                public void displayVehicleDetails() {
                    displayVehicleInfo();
                    System.out.println("Seat Capacity: " + seatCapacity);
                    System.out.println("Fuel Type: " + fuelType);
                    System.out.println("Automatic: " + (automatic ? "Yes" : "No"));
                    System.out.println("Air Bags: " + airBags);
                    System.out.println("Transmission Type: " + transmissionType);
                    System.out.println("Sun Roof: " + (sunRoof ? "Yes" : "No"));
                }

                public void openSunRoof(){
                    if(sunRoof){
                        System.out.println("Sun roof opened");
                    } else {
                        System.out.println("This car does not have a sun roof");
                    }
                }

                public void startVehicle(){
                    super.startVehicle();
                    getEngine().startEngine();
                }
                
                public void sartVehicle(boolean withMusic){
                    super.startVehicle();
                    getEngine().startEngine();
                }   
                
                public void stopVehicle(){
                    super.stopVehicle();
                    getEngine().stopEngine();
                }

                public static void companyPolicy(){
                    System.out.println("Company policy for cars: All cars must be returned with a full tank of fuel and clean interior.");
                } 

                public double calculateInsurancePremium(){
                    double premium = getRentPerDay() * 0.15; // Example insurance premium calculation for cars
                    System.out.println("Insurance Premium for car: $" + premium);
                    return premium;
                }

                public void displayInsuranceDetails(){
                    System.out.println("Insurance details for car: " + getBrand());
                    calculateInsurancePremium();
                }

                //getter and setter methods 
                public int getSeatCapacity() {
                    return seatCapacity;
                }

                public String getFuelType() {
                    return fuelType;
                }

                public boolean isAutomatic() {
                    return automatic;
                }

                public int getAirBags() {
                    return airBags;
                }

                public String getTransmissionType() {
                    return transmissionType;
                }

                public boolean isSunRoof() {
                    return sunRoof;
                } 

}
