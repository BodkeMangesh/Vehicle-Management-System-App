package vehiclemanagement;

public class Bike extends Vehicle {
    private boolean helmetIncluded;
    private boolean sportsBike;
    private int mileage;

    private boolean discBrake;
    private boolean electricBike;
    private int topSpeed;

    public Bike(int vehicleId,
                String brand,
                double rentPerDay,
                boolean isAvailable,
                String vehicleNumber,
                String color,
                int modelYear,
                double totalDistance,
                Engine engine,
                boolean helmetIncluded,
                boolean sportsBike,
                int mileage,
                boolean discBrake,
                boolean electricBike,
                int topSpeed) 
                
                {
                    super(vehicleId, brand, rentPerDay, isAvailable, vehicleNumber, color, modelYear, totalDistance, engine);
                    this.helmetIncluded = helmetIncluded;
                    this.sportsBike = sportsBike;
                    this.mileage = mileage;
                    this.discBrake = discBrake;
                    this.electricBike = electricBike;
                    this.topSpeed = topSpeed;
                }

                public Double calculateRent(int days) {
                    double rent = getRentPerDay() * days;
                    if(sportsBike){
                        rent += 30; // Additional charge for sports bikes
                    }else if(electricBike){
                        rent += 20; // Additional charge for electric bikes
                    }
                    return rent;    
                }

                public void performMaintenance() {
                    System.out.println("Performing maintenance for bike: " + getBrand());
                    // Maintenance logic here

                }

                public void displayVehicleDetails() {
                    displayVehicleInfo();
                    System.out.println("Helmet Included: " + (helmetIncluded ? "Yes" : "No"));
                    System.out.println("Sports Bike: " + (sportsBike ? "Yes" : "No"));
                    System.out.println("Mileage: " + mileage + " km/l");
                    System.out.println("Disc Brake: " + (discBrake ? "Yes" : "No"));
                    System.out.println("Electric Bike: " + (electricBike ? "Yes" : "No"));
                    System.out.println("Top Speed: " + topSpeed + " km/h");
                }

                public void wheelieMode(){
                    if(sportsBike){
                        System.out.println("Wheelie mode activated");
                    } else {
                        System.out.println("This bike does not support wheelie mode");
                    }
                }

                public void chargeBattery(){
                    if(electricBike){
                        System.out.println("Battery charging started");
                    } else {
                        System.out.println("This bike does not have a battery to charge");
                    }
                }

                public void startVehicle(){
                    super.startVehicle();
                    getEngine().startEngine();
                }

                public void stopVehicle(){
                    super.stopVehicle();
                    getEngine().stopEngine();
                }

                public static void companyPolicy(){
                    System.out.println("Company policy for bikes: All bikes must be returned with a full tank of fuel and in good condition.");
                }

                public double calculateInsurancePremium(){
                    double premium = getRentPerDay() * 0.12; // Example insurance premium calculation for bikes
                    System.out.println("Insurance Premium for bike: $" + premium);
                    return premium;
                }

                public void displayInsuranceDetails(){
                    System.out.println("Insurance details for bike: " + getBrand());
                    calculateInsurancePremium();
                }   



                public boolean isHelmetIncluded() {
                    return helmetIncluded;
                }
                public boolean isSportsBike() {
                    return sportsBike;
                }
                public int getMileage() {
                    return mileage;
                }   
                public boolean isDiscBrake() {
                    return discBrake;
                }
                public boolean isElectricBike() {
                    return electricBike;
                }
                public int getTopSpeed() {
                    return topSpeed;
                }


}