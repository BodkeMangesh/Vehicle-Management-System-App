package vehiclemanagement;

import java.util.*;

public class CustomerService {
    private HashMap<Integer, Customer> customers = new HashMap<>();

    public void addCustomer(Customer customer){
        customers.put(customer.getCustomerId(), customer);
        System.out.println("Customer added: " + customer.getCustomerName());
    }

    public void removeCustomer(int customerId){
        customers.remove(customerId);
        System.out.println("Customer removed with ID: " + customerId);
    }

    public void showAllCustomers(){
        if(customers.isEmpty()) {

        System.out.println("No Customers Found");

        return;
    }


    for(Customer c : customers.values()) {

        System.out.println("----------------");

        c.displayCustomerDetails();

        System.out.println("----------------");
    }
    }
    
    public void verifyCustomer(int customerId){
        Customer customer = customers.get(customerId);
        if(customer != null){
            customer.verifyCustomer();
            return;
        }
        System.out.println("Customer not found with ID: " + customerId);
    }   

    public void searchCustomerById(int customerId){
        Customer customer = customers.get(customerId);
        if(customer != null){
            customer.displayCustomerDetails();
            return;
        }
        System.out.println("Customer not found with ID: " + customerId);
    } 

    private ArrayList<Vehicle> rentedVehicles ;
} 

