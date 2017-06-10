package factoryPattern.simpleFactory

import factoryPattern.Pizza
import factoryPattern.CheesePizza
import factoryPattern.GreekPizza


class PizzaStore(val pizzaFactory: SimplePizzaFactory) {

    fun orderPizza(type: String): Pizza {
        val pizza = pizzaFactory.createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}

class SimplePizzaFactory {
    var pizza: Pizza? = null

    fun createPizza(type: String): Pizza {
        if (type.equals("CheesePizza")) {
            pizza = CheesePizza()
        }
        else if (type.equals("GreekPizza")) {
            pizza = GreekPizza()
        }
        else {
            throw Exception("Unable to recognize your input: $pizza")
        }

        return pizza!!
    }
}