class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(value: Int?) {
            field = value
            counter++
        }
}