package org.lld.customerqueue;

class RatioRule implements Rule {

    final int vipCustomersLimit;
    final int regularCustomersLimit;

    int vipCustomerServed = 0;
    int regularCustomerServed = 0;

    public RatioRule(int vipCustomersLimit, int regularCustomersLimit) {
        this.vipCustomersLimit = vipCustomersLimit;
        this.regularCustomersLimit = regularCustomersLimit;
    }

    public CustomerType getNextCustomerType() {
        if (vipCustomerServed == vipCustomersLimit
                && regularCustomerServed == regularCustomersLimit) {
            vipCustomerServed = 0;
            regularCustomerServed = 0;
        }

        if (vipCustomerServed < vipCustomersLimit) {
            vipCustomerServed++;
            return CustomerType.VIP;
        }

        regularCustomerServed++;
        return CustomerType.REGULAR;
    }
}
