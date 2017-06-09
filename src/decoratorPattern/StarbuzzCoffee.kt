package decoratorPattern

fun main(args: Array<String>) {
    val beverage = Expresso()
    println(beverage.description + "$${beverage.cost()}")

    var mixedBeverage: Beverage = HouseBlend()
    mixedBeverage = Mocha(mixedBeverage)
    mixedBeverage = Mocha(mixedBeverage)
    mixedBeverage = Whip(mixedBeverage)

    println(mixedBeverage.description + "$${mixedBeverage.cost()}")

}
