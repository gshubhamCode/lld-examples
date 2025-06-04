package org.lld.customerqueue;

class RegularCustomer extends Customer {

    RegularCustomer(String name) {
        super(name);
    }

    @Override
    public CustomerType getType() {
        return CustomerType.REGULAR;
    }
}
