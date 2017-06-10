package factoryPattern.abstractFactory


fun main(args: Array<String>) {
    val nyPizza = NYCustomizedPizza(NYPizzaIntegredientFactory())
    val chicagoPizza = ChicagoCutomizedPizza(ChicagoPizzaIntegredientFactory())
    nyPizza.prepare()
    chicagoPizza.prepare()
}
