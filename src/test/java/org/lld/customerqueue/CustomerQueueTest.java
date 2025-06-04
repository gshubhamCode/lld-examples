package org.lld.customerqueue;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CustomerQueueTest {

    @Test
    public void testAllVipCustomers() {
        CustomerHandler handler = new CustomerHandler(new RatioRule(3, 2));
        addAllVipCustomers(handler);

        List<Customer> served = new ArrayList<>();
        Customer customer = handler.getNextCustomer();
        while (customer != null) {
            Assertions.assertEquals(CustomerType.VIP, customer.getType());
            served.add(customer);
            customer = handler.getNextCustomer();
        }

        Assertions.assertEquals(8, served.size());
    }

    @Test
    public void testAllRegularCustomers() {
        CustomerHandler handler = new CustomerHandler(new RatioRule(3, 2));
        addAllRegularCustomers(handler);

        List<Customer> served = new ArrayList<>();
        Customer customer = handler.getNextCustomer();
        while (customer != null) {
            Assertions.assertEquals(CustomerType.REGULAR, customer.getType());
            served.add(customer);
            customer = handler.getNextCustomer();
        }

        Assertions.assertEquals(8, served.size());
    }


    @Test
    public void testMix1Customers() {
        CustomerHandler handler = new CustomerHandler(new RatioRule(3, 2));
        addMixCustomers_1(handler);

        List<Customer> expectedOrder1 = new ArrayList<>();
        expectedOrder1.add(new VIPCustomer("B"));
        expectedOrder1.add(new VIPCustomer("C"));
        expectedOrder1.add(new VIPCustomer("F"));
        expectedOrder1.add(new RegularCustomer("A"));
        expectedOrder1.add(new RegularCustomer("D"));
        expectedOrder1.add(new RegularCustomer("E"));
        expectedOrder1.add(new RegularCustomer("G"));
        expectedOrder1.add(new RegularCustomer("H"));


        List<Customer> actual1 = new ArrayList<>();
        Customer customer = handler.getNextCustomer();
        while (customer != null) {
            actual1.add(customer);
            customer = handler.getNextCustomer();
        }

        Assertions.assertEquals(expectedOrder1, actual1);

        // RatioRule(2, 3)
        handler = new CustomerHandler(new RatioRule(2, 3));
        addMixCustomers_1(handler);

        List<Customer> expectedOrder2 = new ArrayList<>();
        expectedOrder2.add(new VIPCustomer("B"));
        expectedOrder2.add(new VIPCustomer("C"));
        expectedOrder2.add(new RegularCustomer("A"));
        expectedOrder2.add(new RegularCustomer("D"));
        expectedOrder2.add(new RegularCustomer("E"));
        expectedOrder2.add(new VIPCustomer("F"));
        expectedOrder2.add(new RegularCustomer("G"));
        expectedOrder2.add(new RegularCustomer("H"));


        List<Customer> actuals2 = new ArrayList<>();
        customer = handler.getNextCustomer();
        while (customer != null) {
            actuals2.add(customer);
            customer = handler.getNextCustomer();
        }

        Assertions.assertEquals(expectedOrder2, actuals2);
    }


    // ========== Utility ==========

    private void addMixCustomers_1(CustomerHandler handler) {
        handler.addCustomer(new RegularCustomer("A"));
        handler.addCustomer(new VIPCustomer("B"));
        handler.addCustomer(new VIPCustomer("C"));
        handler.addCustomer(new RegularCustomer("D"));
        handler.addCustomer(new RegularCustomer("E"));
        handler.addCustomer(new VIPCustomer("F"));
        handler.addCustomer(new RegularCustomer("G"));
        handler.addCustomer(new RegularCustomer("H"));

    }

    private void addAllVipCustomers(CustomerHandler handler) {
        List.of("A", "B","C","D","E","F","G","H").forEach(x  -> handler.addCustomer(new VIPCustomer(x)));
    }

    private void addAllRegularCustomers(CustomerHandler handler) {
        List.of("A", "B","C","D","E","F","G","H").forEach(x  -> handler.addCustomer(new RegularCustomer(    x)));
    }

}
