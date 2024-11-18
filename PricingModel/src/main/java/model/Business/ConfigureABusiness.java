/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

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

        return business;
    
  }
}
