package org.lld.customerqueue;

import java.util.LinkedList;
import java.util.Queue;

class CustomerHandler {

    Queue<Customer> vipCustomers = new LinkedList<>();
    Queue<Customer> regularCustomers = new LinkedList<>();
    Rule rule;

    CustomerHandler(Rule rule) {
        this.rule = rule;
    }

    public void addCustomer(Customer customer) {
        if (customer.getType() == CustomerType.VIP) {
            vipCustomers.add(customer);
        } else {
            regularCustomers.add(customer);
        }
    }


    public Customer getNextCustomer() {
        CustomerType nextCustomerType = rule.getNextCustomerType();

        if (nextCustomerType == CustomerType.VIP && !vipCustomers.isEmpty()) {
            return vipCustomers.remove();
        }
        if (nextCustomerType == CustomerType.REGULAR && !regularCustomers.isEmpty()) {
            return regularCustomers.remove();
        }

        if (!vipCustomers.isEmpty())
            return vipCustomers.remove();
        if (!regularCustomers.isEmpty())
            return regularCustomers.remove();

        return null;
    }


}
