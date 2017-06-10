package factoryPattern

interface Pizza {
    open val pizzaName: String

    fun prepare(): Unit {
        println("Prepare $pizzaName")
    }

    fun bake(): Unit {
        println("Bake $pizzaName")
    }

    fun cut(): Unit {
        println("Cut $pizzaName")
    }

    fun box(): Unit {
        println("Box $pizzaName")
    }
}

class CheesePizza: Pizza {
    override val pizzaName: String = "CheesePizza"
}

class GreekPizza: Pizza {
    override val pizzaName: String = "GreekPizza"
}

enum class PizzaType {
    CheesePizza, GreekPizza
}
