/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import java.util.Random;
import model.Business.Business;
import model.CustomerManagement.CustomerDirectory;
import model.CustomerManagement.CustomerProfile;
import model.MarketingManagement.MarketingPersonDirectory;
import model.MarketingManagement.MarketingPersonProfile;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.Personnel.EmployeeDirectory;
import model.Personnel.EmployeeProfile;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.ProductManagement.ProductSummary;
import model.SalesManagement.SalesPersonDirectory;
import model.SalesManagement.SalesPersonProfile;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class ConfigureABusiness {

  public static Business initialize() {
    Business business = new Business("Xerox");
    Random random = new Random();
        SupplierDirectory suplierdirectory = business.getSupplierDirectory();

        Supplier supplier1 = suplierdirectory.newSupplier("Lenovo");
        ProductCatalog productcatalog = supplier1.getProductCatalog();
        Product s1p1 = productcatalog.newProduct("Scanner 1", 2000, 16500, 10000);
        Product s1p2 = productcatalog.newProduct("Scanner 2", 10000, 25000, 16500);
        Product s1p3 = productcatalog.newProduct("Printer 1", 22000, 40000, 36500);
        Product s1p4 = productcatalog.newProduct("Photocopier 1 ", 30000, 70000, 50000);
        Product s1p5 = productcatalog.newProduct("Scanner  3", 19000, 36500, 25000);
        Product s1p6 = productcatalog.newProduct("Scanner 4", 90000, 125000, 105000);
        Product s1p7 = productcatalog.newProduct("Printer 2", 22000, 60000, 36500);
        Product s1p8 = productcatalog.newProduct("Photocopier 2", 30000, 70000, 50000);
        Product s1p9 = productcatalog.newProduct("Photocopier 3", 40000, 80000, 60000);
        Product s1p10 = productcatalog.newProduct("Photocopier 4", 50000, 90000, 70000);
        
        Supplier supplier2 = suplierdirectory.newSupplier("HP");
        ProductCatalog productCatalog2 = supplier2.getProductCatalog();
        Product s2p1 = productCatalog2.newProduct("Laptop 1", 50000, 70000, 60000);
        Product s2p2 = productCatalog2.newProduct("Laptop 2", 60000, 90000, 75000);
        Product s2p3 = productCatalog2.newProduct("Desktop 1", 30000, 50000, 40000);
        Product s2p4 = productCatalog2.newProduct("Desktop 2", 35000, 55000, 45000);
        Product s2p5 = productCatalog2.newProduct("Monitor 1", 8000, 15000, 12000);
        Product s2p6 = productCatalog2.newProduct("Monitor 2", 10000, 18000, 14000);
        Product s2p7 = productCatalog2.newProduct("Keyboard", 1000, 5000, 3000);
        Product s2p8 = productCatalog2.newProduct("Mouse", 500, 3000, 1500);
        Product s2p9 = productCatalog2.newProduct("Printer", 12000, 25000, 18000);
        Product s2p10 = productCatalog2.newProduct("Scanner", 15000, 30000, 22000);

        Supplier supplier3 = suplierdirectory.newSupplier("Dell");
        ProductCatalog productCatalog3 = supplier3.getProductCatalog();
        Product s3p1 = productCatalog3.newProduct("Laptop X", 60000, 85000, 70000);
        Product s3p2 = productCatalog3.newProduct("Laptop Y", 75000, 110000, 90000);
        Product s3p3 = productCatalog3.newProduct("Desktop X", 40000, 60000, 50000);
        Product s3p4 = productCatalog3.newProduct("Desktop Y", 45000, 70000, 60000);
        Product s3p5 = productCatalog3.newProduct("Monitor A", 10000, 20000, 15000);
        Product s3p6 = productCatalog3.newProduct("Monitor B", 12000, 25000, 18000);
        Product s3p7 = productCatalog3.newProduct("Headphones", 3000, 8000, 5000);
        Product s3p8 = productCatalog3.newProduct("Speaker", 5000, 15000, 10000);
        Product s3p9 = productCatalog3.newProduct("Docking Station", 8000, 20000, 15000);
        Product s3p10 = productCatalog3.newProduct("Webcam", 2500, 8000, 5000);

        Supplier supplier4 = suplierdirectory.newSupplier("Acer");
        ProductCatalog productCatalog4 = supplier4.getProductCatalog();
        Product s4p1 = productCatalog4.newProduct("Chromebook 1", 20000, 30000, 25000);
        Product s4p2 = productCatalog4.newProduct("Chromebook 2", 25000, 35000, 30000);
        Product s4p3 = productCatalog4.newProduct("Tablet 1", 15000, 25000, 20000);
        Product s4p4 = productCatalog4.newProduct("Tablet 2", 18000, 28000, 23000);
        Product s4p5 = productCatalog4.newProduct("Monitor C", 7000, 15000, 10000);
        Product s4p6 = productCatalog4.newProduct("Monitor D", 8000, 18000, 12000);
        Product s4p7 = productCatalog4.newProduct("Gaming Mouse", 3000, 7000, 5000);
        Product s4p8 = productCatalog4.newProduct("Gaming Keyboard", 4000, 10000, 7000);
        Product s4p9 = productCatalog4.newProduct("Gaming Headset", 5000, 12000, 8000);
        Product s4p10 = productCatalog4.newProduct("Webcam Pro", 4000, 10000, 6000);

        Supplier supplier5 = suplierdirectory.newSupplier("Asus");
        ProductCatalog productCatalog5 = supplier5.getProductCatalog();
        Product s5p1 = productCatalog5.newProduct("Gaming Laptop 1", 80000, 120000, 100000);
        Product s5p2 = productCatalog5.newProduct("Gaming Laptop 2", 90000, 140000, 115000);
        Product s5p3 = productCatalog5.newProduct("Desktop Pro 1", 60000, 100000, 80000);
        Product s5p4 = productCatalog5.newProduct("Desktop Pro 2", 65000, 105000, 85000);
        Product s5p5 = productCatalog5.newProduct("Ultra Monitor", 20000, 35000, 25000);
        Product s5p6 = productCatalog5.newProduct("Compact Monitor", 15000, 28000, 22000);
        Product s5p7 = productCatalog5.newProduct("Wireless Mouse", 2000, 6000, 4000);
        Product s5p8 = productCatalog5.newProduct("Mechanical Keyboard", 5000, 12000, 8000);
        Product s5p9 = productCatalog5.newProduct("Gaming Headset X", 6000, 15000, 10000);
        Product s5p10 = productCatalog5.newProduct("Webcam HD", 5000, 12000, 7000);
        

// Create Persons
        PersonDirectory persondirectory = business.getPersonDirectory();
// person representing sales organization        
        Person xeroxSalesperson001 = persondirectory.newPerson("Xerox Sales Person");
        // adding Marketing Person
        Person xeroxMarketingperson001 = persondirectory.newPerson("Xerox Marketing"); // He is the Supplier
        // adding Admin Person
//        Person xeroxadminperson001 = persondirectory.newPerson("Xerox admin");
        // Supplier
        
        
        // adding Customer Person
// Create person objects to represent customer organizations. 
        Person person005 = persondirectory.newPerson("Dan");
        Person person006 = persondirectory.newPerson("Man");
        Person person007 = persondirectory.newPerson("Arharva");
        Person person008 = persondirectory.newPerson("Je");
        Person person009 = persondirectory.newPerson("Giridhar"); //we use this as customer
        Person person010 = persondirectory.newPerson("John");
        Person person011 = persondirectory.newPerson("Doe");
        Person person012 = persondirectory.newPerson("James");
        Person person013 = persondirectory.newPerson("Jane");
        Person person014 = persondirectory.newPerson("Girl");

// Create Customers
        CustomerDirectory customedirectory = business.getCustomerDirectory();
        CustomerProfile customerprofile1 = customedirectory.newCustomerProfile(person005);
        CustomerProfile customerprofile2 = customedirectory.newCustomerProfile(person006);
        CustomerProfile customerprofile3 = customedirectory.newCustomerProfile(person007);
        CustomerProfile customerprofile4 = customedirectory.newCustomerProfile(person008);
        CustomerProfile customerprofile5 = customedirectory.newCustomerProfile(person009);
        CustomerProfile customerprofile6 = customedirectory.newCustomerProfile(person010);
        CustomerProfile customerprofile7 = customedirectory.newCustomerProfile(person011);
        CustomerProfile customerprofile8 = customedirectory.newCustomerProfile(person012);
        CustomerProfile customerprofile9 = customedirectory.newCustomerProfile(person013);
        CustomerProfile customerprofile10 = customedirectory.newCustomerProfile(person014);

// Create Sales people
        SalesPersonDirectory salespersondirectory = business.getSalesPersonDirectory();
        SalesPersonProfile salespersonprofile = salespersondirectory.newSalesPersonProfile(xeroxSalesperson001);

// Create Marketing people
        MarketingPersonDirectory marketingpersondirectory = business.getMarketingPersonDirectory();
        MarketingPersonProfile marketingpersonprofile0 = marketingpersondirectory.newMarketingPersonProfile(xeroxMarketingperson001);

// Create Admins to manage the business
 //       EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
 //       EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(xeroxadminperson001);

// Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount ua1 = uadirectory.newUserAccount(salespersonprofile, "Sales", "."); /// order products for one of the customers and performed by a sales person
        UserAccount ua2 = uadirectory.newUserAccount(marketingpersonprofile0, "Marketing", "."); /// order products for one of the customers and performed by a sales person
 //       UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "Admin", "XXXX"); /// order products for one of the customers and performed by a sales person

// Process Orders on behalf of sales person and customer
        MasterOrderList masterorderlist = business.getMasterOrderList();
        Order order1 = masterorderlist.newOrder(customerprofile4, salespersonprofile);
        OrderItem oi1 = order1.newOrderItem(s1p1, 18000, 1);
        OrderItem oi2 = order1.newOrderItem(s1p2, 19500, 4);
        OrderItem oi3 = order1.newOrderItem(s1p3, 36500, 10);
        OrderItem oi4 = order1.newOrderItem(s1p4, 50000, 1);
        OrderItem oi5 = order1.newOrderItem(s1p5, 25000, 3);
        OrderItem oi6 = order1.newOrderItem(s1p6, 105000, 2);
        OrderItem oi7 = order1.newOrderItem(s1p7, 36500, 3);
        OrderItem oi8 = order1.newOrderItem(s1p8, 50000, 2);
        OrderItem oi9 = order1.newOrderItem(s1p9, 55000, 3);
        OrderItem oi10 = order1.newOrderItem(s1p10, 65000, 4);

        Order order12 = masterorderlist.newOrder(customerprofile4, salespersonprofile);
        OrderItem oi112 = order1.newOrderItem(s1p1, 17000, 1);
        OrderItem oi12 = order1.newOrderItem(s1p2, 9500, 4);
        OrderItem oi13 = order1.newOrderItem(s1p3, 29500, 10);
        OrderItem oi14 = order1.newOrderItem(s1p4, 30000, 1);
        OrderItem oi15 = order1.newOrderItem(s1p5, 2000, 3);
        OrderItem oi16 = order1.newOrderItem(s1p6, 95000, 2);
        OrderItem oi17 = order1.newOrderItem(s1p7, 26500, 3);
        OrderItem oi18 = order1.newOrderItem(s1p8, 40000, 2);
        OrderItem oi19 = order1.newOrderItem(s1p9, 50000, 3);
        OrderItem oi20 = order1.newOrderItem(s1p10, 60000, 4);
        
        Order order2 = masterorderlist.newOrder(customerprofile2, salespersonprofile);
        OrderItem h1oi1 = order2.newOrderItem(s2p1, 60000, 2);
        OrderItem h1oi2 = order2.newOrderItem(s2p2, 75000, 4);
        OrderItem h1oi3 = order2.newOrderItem(s2p3, 42000, 6);
        OrderItem h1oi4 = order2.newOrderItem(s2p4, 46000, 3);
        OrderItem h1oi5 = order2.newOrderItem(s2p5, 13000, 5);
        OrderItem h1oi6 = order2.newOrderItem(s2p6, 17000, 3);
        OrderItem h1oi7 = order2.newOrderItem(s2p7, 4000, 10);
        OrderItem h1oi8 = order2.newOrderItem(s2p8, 2500, 15);
        OrderItem h1oi9 = order2.newOrderItem(s2p9, 20000, 7);
        OrderItem h1oi10 = order2.newOrderItem(s2p10, 25000, 5);

        // For Dell
        Order order3 = masterorderlist.newOrder(customerprofile3, salespersonprofile);
        OrderItem d1oi1 = order3.newOrderItem(s3p1, 70000, 2);
        OrderItem d1oi2 = order3.newOrderItem(s3p2, 90000, 3);
        OrderItem d1oi3 = order3.newOrderItem(s3p3, 48000, 4);
        OrderItem d1oi4 = order3.newOrderItem(s3p4, 50000, 2);
        OrderItem d1oi5 = order3.newOrderItem(s3p5, 16000, 5);
        OrderItem d1oi6 = order3.newOrderItem(s3p6, 20000, 3);
        OrderItem d1oi7 = order3.newOrderItem(s3p7, 6000, 7);
        OrderItem d1oi8 = order3.newOrderItem(s3p8, 9000, 5);
        OrderItem d1oi9 = order3.newOrderItem(s3p9, 18000, 4);
        OrderItem d1oi10 = order3.newOrderItem(s3p10, 7000, 6);

        // For Acer
        Order order4 = masterorderlist.newOrder(customerprofile4, salespersonprofile);
        OrderItem a1oi1 = order4.newOrderItem(s4p1, 28000, 3);
        OrderItem a1oi2 = order4.newOrderItem(s4p2, 31000, 5);
        OrderItem a1oi3 = order4.newOrderItem(s4p3, 23000, 4);
        OrderItem a1oi4 = order4.newOrderItem(s4p4, 27000, 3);
        OrderItem a1oi5 = order4.newOrderItem(s4p5, 11000, 7);
        OrderItem a1oi6 = order4.newOrderItem(s4p6, 14000, 4);
        OrderItem a1oi7 = order4.newOrderItem(s4p7, 5000, 5);
        OrderItem a1oi8 = order4.newOrderItem(s4p8, 8000, 8);
        OrderItem a1oi9 = order4.newOrderItem(s4p9, 9000, 6);
        OrderItem a1oi10 = order4.newOrderItem(s4p10, 7000, 7);

        // For Asus
        Order order5 = masterorderlist.newOrder(customerprofile5, salespersonprofile);
        OrderItem as1oi1 = order5.newOrderItem(s5p1, 100000, 3);
        OrderItem as1oi2 = order5.newOrderItem(s5p2, 110000, 2);
        OrderItem as1oi3 = order5.newOrderItem(s5p3, 90000, 5);
        OrderItem as1oi4 = order5.newOrderItem(s5p4, 95000, 3);
        OrderItem as1oi5 = order5.newOrderItem(s5p5, 27000, 6);
        OrderItem as1oi6 = order5.newOrderItem(s5p6, 24000, 4);
        OrderItem as1oi7 = order5.newOrderItem(s5p7, 4000, 10);
        OrderItem as1oi8 = order5.newOrderItem(s5p8, 7000, 9);
        OrderItem as1oi9 = order5.newOrderItem(s5p9, 11000, 6);
        OrderItem as1oi10 = order5.newOrderItem(s5p10, 7500, 7);

        System.out.println("Generated Customers:");
    for (CustomerProfile customerProfile : customedirectory.getCustomerlist()) {
        System.out.println("    Customer: " + customerProfile.getPerson().getPersonId());  // Assuming getPersonName() exists
    }
      System.out.println("\n");

    // Output statistics for each supplier and their products

    for (int supplierIndex = 0; supplierIndex < suplierdirectory.getSuplierList().size(); supplierIndex++) {
        Supplier supplier = suplierdirectory.getSuplierList().get(supplierIndex);

        // Print supplier name
        System.out.println("Supplier: " + supplier.getName());

        // Iterate through each product of the supplier
        for (int productIndex = 0; productIndex < supplier.getProductCatalog().getProductList().size(); productIndex++) {
            Product product = supplier.getProductCatalog().getProductList().get(productIndex);

            // Set unique product name by adding supplier index
            String uniqueProductName = "Product_S" + (supplierIndex + 1) + "_P" + (productIndex + 1);
            product.setName(uniqueProductName);

            ProductSummary productSummary = new ProductSummary(product);
            System.out.println("    Product: " + product.getName());
            System.out.println("        Sales Volume: " + productSummary.getSalesRevenues());
            System.out.println("        Profit Margin: " + productSummary.getProductPricePerformance());
            System.out.println("        Frequency above target: " + productSummary.getNumberAboveTarget());
            System.out.println("        Frequency below target: " + productSummary.getNumberBelowTarget());

            // Generate 10 orders per product and display them
            System.out.println("        Orders for " + product.getName()+ ":");

            for (int i = 0; i < 10; i++) {
                // Get the same customer for this cycle of 10 orders
                CustomerProfile customer = customedirectory.getCustomerlist().get(i % customedirectory.getCustomerlist().size());
                Order order = masterorderlist.newOrder(customer, salespersonprofile);
                int quantity = random.nextInt(10) + 1;
                int actualPrice = product.getTargetPrice() + random.nextInt(1000) - 500;
                order.newOrderItem(product, actualPrice, quantity);

                System.out.println("            Order " + (i+1) + ": Customer: " + customer.getPerson().getPersonId() + ", Quantity: " + quantity + ", Price: " + actualPrice);
            }
        }

        System.out.println("\n");
    }
        return business;
    
  }
}