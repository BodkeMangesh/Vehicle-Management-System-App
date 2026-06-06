package vehiclemanagement;

public  class Customer {
    private int customerId;
    private String customerName;
    private String phoneNumber;
    private String email;
    private String licenseNumber;

    private String address;
    private int age;
    private boolean verifiedCustomer;

    public Customer(int customerId,
                    String customerName,
                    String phoneNumber,
                    String email,
                    String licenseNumber,
                    String address,
                    int age,
                    boolean verifiedCustomer) 
                    
                    {
                        this.customerId = customerId;
                        this.customerName = customerName;
                        this.phoneNumber = phoneNumber;
                        this.email = email;
                        this.licenseNumber = licenseNumber;
                        this.address = address;
                        this.age = age;
                        this.verifiedCustomer = verifiedCustomer;
                    }
                    
                public void verifyCustomer(){
                    if(age >= 18 && licenseNumber != null){
                        verifiedCustomer = true;
                        System.out.println("Customer verified successfully");
                    } else {
                        verifiedCustomer = false;
                        System.out.println("Customer verification failed");
                    }   
                }
                 
                public int getCustomerId() {
                    return customerId;
                }

                public String getCustomerName() {
                    return customerName;
                }

                public String getPhoneNumber() {
                    return phoneNumber;
                }

                public String getEmail() {
                    return email;
                }

                public String getLicenseNumber() {
                    return licenseNumber;
                }

                public String getAddress() {
                    return address;
                }

                public int getAge() {
                    return age;
                }

                public boolean isVerifiedCustomer() {
                    return verifiedCustomer;
                }
                 
                public void displayCustomerDetails(){
                    System.out.println("Customer ID: " + customerId);
                    System.out.println("Customer Name: " + customerName);
                    System.out.println("Phone Number: " + phoneNumber);
                    System.out.println("Email: " + email);
                    System.out.println("License Number: " + licenseNumber);
                    System.out.println("Address: " + address);
                    System.out.println("Age: " + age);
                    System.out.println("Verified Customer: " + (verifiedCustomer ? "Yes" : "No"));
                }   

}

