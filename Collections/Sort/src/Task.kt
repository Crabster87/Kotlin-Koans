// Return a list of customers, sorted in the descending by number of orders they have made
fun Shop.getCustomersSortedByOrders(): List<Customer> {
    val mutableList = customers.toMutableList()
    return mutableList.sortedByDescending { c: Customer -> c.orders.size }
}
