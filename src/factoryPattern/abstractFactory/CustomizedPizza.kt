package factoryPattern.abstractFactory

import factoryPattern.Pizza


class NYCustomizedPizza(val integredientFactory: PizzaIntegredientFactory): Pizza {
    override val pizzaName: String = "NY CustomizedPizza"

    override fun prepare() {
        println("Prepare Dough: ${integredientFactory.createDough().description}")
        println("Prepare Source: ${integredientFactory.createSauce().description}")
    }
}

class ChicagoCutomizedPizza(val integredientFactory: PizzaIntegredientFactory): Pizza {
    override val pizzaName: String = "Chicago CustomizedPizza"

    override fun prepare() {
        println("Prepare Dough: ${integredientFactory.createDough().description}")
        println("Prepare Source: ${integredientFactory.createSauce().description}")
    }
}