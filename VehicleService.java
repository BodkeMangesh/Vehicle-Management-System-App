package vehiclemanagement;

import java.util.*;

    public class VehicleService {

   
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
        System.out.println("Vehicle added: " + vehicle.getBrand());
    }

    public void removeVehicle(int vehicleId){
        vehicles.removeIf(vehicle -> vehicle.getVehicleId() == vehicleId);
        System.out.println("Vehicle removed with ID: " + vehicleId);
    }

    public void showAllVehicles(){
        if(vehicles.isEmpty()){
            System.out.println("No vehicles available");
            return;
        }
        System.out.println("===== VEHICLE DETAILS =====");
        for(Vehicle vehicle : vehicles){
           
            System.out.println("-----------------------");

            vehicle.displayVehicleDetails();
           
            System.out.println("-----------------------");
        }
    }

    public Vehicle searchVehicleById(int vehicleId){
        for(Vehicle vehicle : vehicles){
            if(vehicle.getVehicleId() == vehicleId){
                vehicle.displayVehicleDetails();
                return vehicle;
            }
        }
        System.out.println("Vehicle not found with ID: " + vehicleId);
        return null;
    }

    public void rentVehicle(int vehicleId, int days){
        for(Vehicle vehicle : vehicles){
            if(vehicle.getVehicleId() == vehicleId){
                vehicle.rentVehicle();
                double rent = vehicle.calculateRent(days);
                System.out.println("Total rent for " + days + " days: $" + rent);
                return;
            }
        }
        System.out.println("Vehicle not found with ID: " + vehicleId);
    } 
    
    public void returnVehicle(int vehicleId){
        for(Vehicle vehicle : vehicles){
            if(vehicle.getVehicleId() == vehicleId){
                vehicle.returnVehicle();
                return;
            }
        }
        System.out.println("Vehicle not found with ID: " + vehicleId);
    }
    
    public void showAvailableVehicles(){
        boolean found = false;

        for(Vehicle v : vehicles) {

        if(v.isAvailable()) {

            found = true;

            System.out.println("----------------");

            v.displayVehicleDetails();

            System.out.println("----------------");
        }
    }


    if(!found) {

        System.out.println("No Available Vehicles");
    }

        }
     
    
    private HashMap <Integer, Vehicle> vehicleMap = new HashMap<>();    

    public void addVehicleToMap(Vehicle vehicle){
        vehicleMap.put(vehicle.getVehicleId(), vehicle);
        System.out.println("Vehicle added to map: " + vehicle.getBrand());
    }
}
    


    
