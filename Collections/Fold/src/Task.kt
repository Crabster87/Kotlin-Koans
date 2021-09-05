// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> {
    return customers.fold(allOrderedProducts, {
        orderedByAll, customer ->
        val orderedProducts = customer.orders.flatMap { it.products }.toSet()
        orderedByAll.intersect(orderedProducts) })
}

val Customer.orderedProducts: Set<Product> get() {
    return orders.flatMap({it.products}).toSet()
}

val Shop.allOrderedProducts: Set<Product> get() {
    return customers.flatMap({it.orderedProducts}).toSet()
}