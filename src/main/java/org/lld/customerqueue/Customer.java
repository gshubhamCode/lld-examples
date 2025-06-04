package org.lld.customerqueue;

import java.util.Objects;

abstract class Customer {

    private final String name;

    abstract public CustomerType getType();

    Customer(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return this.name + " " + this.getType().toString();
    }


    // Overriding  for testing
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Customer other = (Customer) obj;
        return this.name.equals(other.name) && this.getType() == other.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, this.getType());
    }
}
