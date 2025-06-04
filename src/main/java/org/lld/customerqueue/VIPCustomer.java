package org.lld.customerqueue;

class VIPCustomer extends Customer {

    VIPCustomer(String name) {
        super(name);
    }

    @Override
    public CustomerType getType() {
        return CustomerType.VIP;
    }
}
