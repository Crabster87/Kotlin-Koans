// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> =
        customers.filter {
            val (del, und) = it.orders.partition { it.isDelivered }
            und.size > del.size
        }.toSet()
