package factoryPattern.factoryMethod

import factoryPattern.Pizza
import factoryPattern.PizzaType

abstract class AbstractPizzaStore {

    fun orderPizza(type: PizzaType): Pizza {
        val pizza = createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }

    abstract fun createPizza(type: PizzaType): Pizza
}

/**
 * Our New York Pizza Store, providing NY style fancy pizzas
 */
class NYPizzaStore: AbstractPizzaStore() {
    var pizza: Pizza? = null

    override fun createPizza(type: PizzaType): Pizza {
        if (type.equals(PizzaType.CheesePizza)) {
            pizza = NYCheesePizza()
        }
        else if (type.equals(PizzaType.GreekPizza)) {
            pizza = NYGreekPizza()
        }
        else {
            throw Exception("Cannot find your pizza with type: $type")
        }
        return pizza!!

    }
}

class ChicagoPizzaStore: AbstractPizzaStore() {
    var pizza: Pizza? = null

    override fun createPizza(type: PizzaType): Pizza {
        pizza = when(type) {
            PizzaType.CheesePizza -> ChicagoCheesePizza()
            PizzaType.GreekPizza -> ChicagoGreekPizza()
            else -> throw Exception("Cannot find your pizza type in Chicago store: ${type.name}")
        }
        return pizza!!
    }

}