package org.lld.customerqueue;


public class CustomerClient {

    public static void main(String[] args) {
        CustomerHandler handler = new CustomerHandler(new RatioRule(2, 1));

        handler.addCustomer(new RegularCustomer("A"));
        handler.addCustomer(new VIPCustomer("B"));
        handler.addCustomer(new VIPCustomer("C"));
        handler.addCustomer(new RegularCustomer("D"));
        handler.addCustomer(new RegularCustomer("E"));
        handler.addCustomer(new VIPCustomer("F"));
        handler.addCustomer(new RegularCustomer("G"));
        handler.addCustomer(new RegularCustomer("H"));

        Customer customer = handler.getNextCustomer();
        while (customer != null) {
            System.out.println(customer);
            customer = handler.getNextCustomer();
        }


    }

}

