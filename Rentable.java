package vehiclemanagement;

public  interface  Rentable {
    
    void rentVehicle();
    void returnVehicle();
    Double calculateRent(int days);
    void performMaintenance();
    void displayVehicleDetails();
    
}

