package vehiclemanagement;

public class Engine {
    private String engineNumber;    
    private int horsePower;
    private String engineType;
    private int cc;

    private boolean engineStatus;
    private double engineOilCapacity;

    public Engine(String engineNumber,
              int horsePower,
              String engineType,
              int cc,
              boolean engineStatus,
              double engineOilCapacity) 
              {
                this.engineNumber = engineNumber;
                this.horsePower = horsePower;
                this.engineType = engineType;
                this.cc = cc;
                this.engineStatus = engineStatus;
                this.engineOilCapacity = engineOilCapacity;
              }

            public void startEngine(){
                if(!engineStatus){
                    System.out.println("Engine started");
                    engineStatus = true;
                } else {
                    System.out.println("Engine is already running");
                }
            } 
            
            public void stopEngine(){
                if(engineStatus){
                    System.out.println("Engine stopped");
                    engineStatus = false;
                } else {
                    System.out.println("Engine is already stopped");
                }
            }   

            public void displayEngineInfo(){
                System.out.println("Engine Number: " + engineNumber);
                System.out.println("Horse Power: " + horsePower);
                System.out.println("Engine Type: " + engineType);
                System.out.println("CC: " + cc);
                System.out.println("Engine Status: " + (engineStatus ? "Running" : "Stopped"));
                System.out.println("Engine Oil Capacity: " + engineOilCapacity + " liters");
            }

            public String getEngineNumber() {
                return engineNumber;
            }

            public int getHorsePower() {
                return horsePower;
            }

            public String getEngineType() {
                return engineType;
            }

            public int getCc() {
                return cc;
            }

            public boolean isEngineStatus() {
                return engineStatus;
            }

            public double getEngineOilCapacity() {
                return engineOilCapacity;
            }

}