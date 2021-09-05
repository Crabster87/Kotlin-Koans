fun Shop.getSetOfCustomers(): Set<Customer> =
        customers.toMutableSet()
