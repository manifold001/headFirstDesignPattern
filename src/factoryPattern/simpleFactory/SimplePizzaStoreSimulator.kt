package factoryPattern.simpleFactory


fun main(args: Array<String>) {
    val pizzaStore = PizzaStore(SimplePizzaFactory())

    println("Test Ordering a CheesePizza")
    pizzaStore.orderPizza("CheesePizza")

    print("Test Ordering a GreekPizza")
    pizzaStore.orderPizza("GreekPizza")
}
