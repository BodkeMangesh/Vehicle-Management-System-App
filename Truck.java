package vehiclemanagement;

public  class Truck extends Vehicle {
    private double loadCapacity;
    private int numberOfWheels;
    private boolean containerTruck;

    private boolean refrigeration;
    private String goodsType;
    private double tollCharges;

    public Truck(int vehicleId,
                 String brand,
                 double rentPerDay,
                 boolean isAvailable,
                 String vehicleNumber,
                 String color,
                 int modelYear,
                 double totalDistance,
                 Engine engine,
                 double loadCapacity,
                 int numberOfWheels,
                 boolean containerTruck,
                 boolean refrigeration,
                 String goodsType,
                 double tollCharges) 
                 
                 {
                    super(vehicleId, brand, rentPerDay, isAvailable, vehicleNumber, color, modelYear, totalDistance, engine);
                    this.loadCapacity = loadCapacity;
                    this.numberOfWheels = numberOfWheels;
                    this.containerTruck = containerTruck;
                    this.refrigeration = refrigeration;
                    this.goodsType = goodsType;
                    this.tollCharges = tollCharges;
                }

                public Double calculateRent(int days) {
                    double rent = getRentPerDay() * days;
                    tollCharges = numberOfWheels * 10; // Example toll charge calculation based on number of wheels
                    if(containerTruck){
                        rent += 100; // Additional charge for container trucks
                    } else if(refrigeration){
                        rent += 80; // Additional charge for refrigerated trucks
                    }
                    return rent;    
                }

                public void performMaintenance() {
                    System.out.println("Performing maintenance for truck: " + getBrand());
                    // Maintenance logic here

                }

                public void displayVehicleDetails() {
                    displayVehicleInfo();
                    System.out.println("Load Capacity: " + loadCapacity + " tons");
                    System.out.println("Number of Wheels: " + numberOfWheels);
                    System.out.println("Container Truck: " + (containerTruck ? "Yes" : "No"));
                    System.out.println("Refrigeration: " + (refrigeration ? "Yes" : "No"));
                    System.out.println("Goods Type: " + goodsType);
                    System.out.println("Toll Charges: $" + tollCharges);
                }

                public void activateRefrigeration(){
                    if(refrigeration){
                        System.out.println("Refrigeration activated");
                    } else {
                        System.out.println("This truck does not have refrigeration");
                    }
                }
                 
                public void loadGoods(){
                    System.out.println("Goods loaded onto the truck");
                }   
                
                public void unloadGoods(){
                    System.out.println("Goods unloaded from the truck");
                }

                public void checkLoadCapacity(double load){
                    if(load <= loadCapacity){
                        System.out.println("Load is within capacity");
                    } else {
                        System.out.println("Load exceeds capacity");
                    }
                }   

                public void calculateTollCharges(){
                    tollCharges = numberOfWheels * 10; // Example toll charge calculation based on number of wheels
                    System.out.println("Toll charges calculated: $" + tollCharges);
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
                    System.out.println("Company policy for trucks: All trucks must be returned with a full tank of fuel and in good condition.");
                }  
                
                public double calculateInsurancePremium(){
                    double premium = getRentPerDay() * 0.2; // Example insurance premium calculation for trucks
                    System.out.println("Insurance Premium for truck: $" + premium);
                    return premium;
                }

                public void displayInsuranceDetails(){
                    System.out.println("Insurance details for truck: " + getBrand());
                    calculateInsurancePremium();
                }


} 
