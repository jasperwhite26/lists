fun main() {
    val groceries = mutableListOf(
        "milk",
        "eggs",
        "cheese",
        "pasta",
        "juice",
        "water"
    )

    groceries.add(3,"bread")
    groceries[4] = "orange juice"
    groceries.removeAt(2)

    print(groceries)
}