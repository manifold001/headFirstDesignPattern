package factoryPattern.factoryMethod

import factoryPattern.Pizza


class NYCheesePizza : Pizza {
    override val pizzaName: String
        get() = "New York Cheese Pizza"
}

class NYGreekPizza: Pizza {
    override val pizzaName: String
        get() = "New York Greek Pizza"
}

class ChicagoCheesePizza: Pizza {
    override val pizzaName: String
        get() = "Chicago Cheese Pizza"
}

class ChicagoGreekPizza: Pizza {
    override val pizzaName: String
        get() = "Chicago Greek Pizza"
}