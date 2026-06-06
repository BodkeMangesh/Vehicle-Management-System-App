package vehiclemanagement;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    VehicleService vehicleService = new VehicleService();
    CustomerService customerService = new CustomerService();    

    while(true) {
        System.out.println("1. Add Car");
        System.out.println("2. Add Bike");     
        System.out.println("3. Add Truck");
        System.out.println("4. Show All Vehicles");
        System.out.println("5. Search Vehicle");
        System.out.println("6. Rent Vehicle");
        System.out.println("7. Return Vehicle");
        System.out.println("8. Show Available Vehicles");
        System.out.println("9. Add Customer");
        System.out.println("10. Show Customers");    
        System.out.println("11. Exit");
        System.out.println("----------------");

        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter Car Details");

                System.out.print("Enter Vehicle Id: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Brand Name: ");
                String brand = sc.nextLine();

                System.out.print("Enter Rent Per Day: ");
                double rent = sc.nextDouble();

                System.out.print("Is Available (true/false): ");
                boolean available = sc.nextBoolean();
                sc.nextLine();

                System.out.print("Enter Vehicle Number: ");
                String number = sc.nextLine();

                System.out.print("Enter Color: ");
                String color = sc.nextLine();

                System.out.print("Enter Model Year: ");
                int year = sc.nextInt();

                System.out.print("Enter Total Distance: ");
                double distance = sc.nextDouble();
                sc.nextLine();



    // ENGINE INPUT

                System.out.print("Enter Engine Number: ");
                String engineNo = sc.nextLine();

                System.out.print("Enter Horse Power: ");
                int hp = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Engine Type: ");
                String engineType = sc.nextLine();

                System.out.print("Enter CC: ");
                int cc = sc.nextInt();

                System.out.print("Engine Status (true/false): ");
                boolean status = sc.nextBoolean();

                System.out.print("Enter Oil Capacity: ");
                double oil = sc.nextDouble();



    // CREATE ENGINE OBJECT

    Engine e = new Engine(
            engineNo,
            hp,
            engineType,
            cc,
            status,
            oil
    );



    // CAR INPUT

                System.out.print("Enter Seat Capacity: ");
                int seats = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Fuel Type: ");
                String fuel = sc.nextLine();

                System.out.print("Automatic Car (true/false): ");
                boolean automatic = sc.nextBoolean();

                System.out.print("Enter Airbags: ");
                int airbags = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Transmission Type: ");
                String transmission = sc.nextLine();

                System.out.print("Sunroof Available (true/false): ");
                boolean sunroof = sc.nextBoolean();



    // CREATE CAR OBJECT

    Car c = new Car(
            id,
            brand,
            rent,
            available,
            number,
            color,
            year,
            distance,
            e,

            seats,
            fuel,
            automatic,
            airbags,
            transmission,
            sunroof
    );



    // ADD TO ARRAYLIST

    vehicleService.addVehicle(c);

    System.out.println("Car Added Successfully");

    break;
           case 2:

                System.out.println("Enter Bike Details");

                System.out.print("Enter Vehicle Id: ");
                int bikeId = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Brand Name: ");
                String bikeBrand = sc.nextLine();

                System.out.print("Enter Rent Per Day: ");
                double bikeRent = sc.nextDouble();

                System.out.print("Is Available (true/false): ");
                boolean bikeAvailable = sc.nextBoolean();
                sc.nextLine();

                System.out.print("Enter Vehicle Number: ");
                String bikeNumber = sc.nextLine();

                System.out.print("Enter Color: ");
                String bikeColor = sc.nextLine();

                System.out.print("Enter Model Year: ");
                int bikeYear = sc.nextInt();

                System.out.print("Enter Total Distance: ");
                double bikeDistance = sc.nextDouble();
                sc.nextLine();



    // ENGINE INPUT

                System.out.print("Enter Engine Number: ");
                String bikeEngineNo = sc.nextLine();

                System.out.print("Enter Horse Power: ");
                int bikeHp = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Engine Type: ");
                String bikeEngineType = sc.nextLine();

                System.out.print("Enter CC: ");
                int bikeCc = sc.nextInt();

                System.out.print("Engine Status (true/false): ");
                boolean bikeStatus = sc.nextBoolean();

                System.out.print("Enter Oil Capacity: ");
                double bikeOil = sc.nextDouble();
                sc.nextLine();



    // CREATE ENGINE OBJECT

    Engine bikeEngine = new Engine(
            bikeEngineNo,
            bikeHp,
            bikeEngineType,
            bikeCc,
            bikeStatus,
            bikeOil
    );



    // BIKE INPUT

                System.out.print("Helmet Included (true/false): ");
                boolean helmet = sc.nextBoolean();

                System.out.print("Sports Bike (true/false): ");
                boolean sports = sc.nextBoolean();

                System.out.print("Enter Mileage: ");
                int mileage = sc.nextInt();

                System.out.print("Disc Brake (true/false): ");
                boolean disc = sc.nextBoolean();

                System.out.print("Electric Bike (true/false): ");
                boolean electric = sc.nextBoolean();

                System.out.print("Enter Top Speed: ");
                int speed = sc.nextInt();



    // CREATE BIKE OBJECT

    Bike b = new Bike(
            bikeId,
            bikeBrand,
            bikeRent,
            bikeAvailable,
            bikeNumber,
            bikeColor,
            bikeYear,
            bikeDistance,
            bikeEngine,

            helmet,
            sports,
            mileage,
            disc,
            electric,
            speed
    );



    // ADD TO ARRAYLIST

    vehicleService.addVehicle(b);

                System.out.println("Bike Added Successfully");

    break;
           
    
    case 3:

                System.out.println("Enter Truck Details");

                System.out.print("Enter Vehicle Id: ");
                int truckId = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Brand Name: ");
                String truckBrand = sc.nextLine();

                System.out.print("Enter Rent Per Day: ");
                double truckRent = sc.nextDouble();

                System.out.print("Is Available (true/false): ");
                boolean truckAvailable = sc.nextBoolean();
                sc.nextLine();

                System.out.print("Enter Vehicle Number: ");
                String truckNumber = sc.nextLine();

                System.out.print("Enter Color: ");
                String truckColor = sc.nextLine();

                System.out.print("Enter Model Year: ");
                int truckYear = sc.nextInt();

                System.out.print("Enter Total Distance: ");
                double truckDistance = sc.nextDouble();
                sc.nextLine();



    // ENGINE INPUT

                System.out.print("Enter Engine Number: ");
                String truckEngineNo = sc.nextLine();

                System.out.print("Enter Horse Power: ");
                int truckHp = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Engine Type: ");
                String truckEngineType = sc.nextLine();

                System.out.print("Enter CC: ");
                int truckCc = sc.nextInt();

                System.out.print("Engine Status (true/false): ");
                boolean truckStatus = sc.nextBoolean();

                System.out.print("Enter Oil Capacity: ");
                double truckOil = sc.nextDouble();
                sc.nextLine();



    // CREATE ENGINE OBJECT

    Engine truckEngine = new Engine(
            truckEngineNo,
            truckHp,
            truckEngineType,
            truckCc,
            truckStatus,
            truckOil
    );



    // TRUCK INPUT

                System.out.print("Enter Load Capacity: ");
                double loadCapacity = sc.nextDouble();

                System.out.print("Enter Number Of Wheels: ");
                int wheels = sc.nextInt();

                System.out.print("Container Truck (true/false): ");
                boolean container = sc.nextBoolean();

                System.out.print("Refrigeration Available (true/false): ");
                boolean refrigeration = sc.nextBoolean();
                sc.nextLine();

                System.out.print("Enter Goods Type: ");
                String goodsType = sc.nextLine();

                System.out.print("Enter Toll Charges: ");
                double toll = sc.nextDouble();



    // CREATE TRUCK OBJECT

    Truck t = new Truck(
            truckId,
            truckBrand,
            truckRent,
            truckAvailable,
            truckNumber,
            truckColor,
            truckYear,
            truckDistance,
            truckEngine,

            loadCapacity,
            wheels,
            container,
            refrigeration,
            goodsType,
            toll
    );



    // ADD TO ARRAYLIST

    vehicleService.addVehicle(t);

    System.out.println("Truck Added Successfully");

    break;     
           
            case 4:
                System.out.println("===== ALL VEHICLES =====");
                vehicleService.showAllVehicles();
                break;
          
            case 5:

                System.out.print("Enter Vehicle Id To Search: ");

                int searchId = sc.nextInt();

                Vehicle foundVehicle = vehicleService.searchVehicleById(searchId);


                if(foundVehicle != null) {

                System.out.println("Vehicle Found");

                foundVehicle.displayVehicleDetails();

                } else {

                    System.out.println("Vehicle Not Found");
                }
    break;
            
            case 6:

                System.out.print("Enter Vehicle Id To Rent: ");

                int rentId = sc.nextInt();

                System.out.print("Enter Number Of Days: ");

                int days = sc.nextInt();



                Vehicle rentVehicle =
                vehicleService.searchVehicleById(rentId);



                    if(rentVehicle != null) {

                        if(rentVehicle.isAvailable()) {

                            rentVehicle.rentVehicle();

                            double totalRent =
                             rentVehicle.calculateRent(days);

                            System.out.println("Vehicle Rented Successfully");

                            System.out.println("Total Rent = " + totalRent);

                    } else {

                            System.out.println("Vehicle Already Rented");
                    }

                    } else {

                        System.out.println("Vehicle Not Found");
    }

    break;
            case 7:
                System.out.println("Enter Vehicle ID to return:");
               
                 int returnId = sc.nextInt();



                Vehicle returnVehicle =
                    vehicleService.searchVehicleById(returnId);

                    if(returnVehicle != null) {

                        if(!returnVehicle.isAvailable()) {

                            returnVehicle.returnVehicle();

                                System.out.println("Vehicle Returned Successfully");

                        } else {

                            System.out.println("Vehicle Already Available");
                        }

                    } else {

                        System.out.println("Vehicle Not Found");
}

    break;

            case 8:

                System.out.println("===== AVAILABLE VEHICLES ====="); 
                
                vehicleService.showAvailableVehicles();
                break;
            
            case 9:

                System.out.println("===== ADD CUSTOMER =====");

                System.out.print("Enter Customer Id: ");
                int customerId = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Customer Name: ");
                String customerName = sc.nextLine();

                System.out.print("Enter Phone Number: ");
                String phone = sc.nextLine();

                System.out.print("Enter Email: ");
                String email = sc.nextLine();

                System.out.print("Enter License Number: ");
                String license = sc.nextLine();

                System.out.print("Enter Address: ");
                String address = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                System.out.print("Verified Customer (true/false): ");
                boolean verified = sc.nextBoolean();



    // CREATE CUSTOMER OBJECT

    Customer customer = new Customer(
            customerId,
            customerName,
            phone,
            email,
            license,
            address,
            age,
            verified
    );



    // ADD CUSTOMER

    customerService.addCustomer(customer);

    System.out.println("Customer Added Successfully");

    break;
           

            case 10:
                System.out.println("===== ALL CUSTOMERS =====");

                customerService.showAllCustomers();
                break;
                
            case 11:
                System.out.println("Exiting...");
                System.out.println("Thank you for using Vehicle Rental System");
                System.exit(0); 
                
            default:


                System.out.println("Invalid Choice. Please try again.");

                break;
        }
    }
}
}