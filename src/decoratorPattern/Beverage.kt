package decoratorPattern

abstract class Beverage {
    open val description: String = "Unknown Beverage"
        get() {
            return field
        }

    abstract fun cost(): Double
}


class Expresso: Beverage() {
    override val description: String = "Expresso"

    override fun cost(): Double {
        return 1.99
    }
}

class HouseBlend: Beverage() {
    override val description: String = "House Blend Coffee"

    override fun cost(): Double {
        return .89
    }
}

class Mocha(val beverage: Beverage): Beverage() {
    override val description: String = beverage.description + ", Mocha"

    override fun cost(): Double {
        return beverage.cost() + .20
    }
}

class Whip(val beverage: Beverage): Beverage() {
    override val description: String = beverage.description + ", Whip"

    override fun cost(): Double {
        return beverage.cost() + 0.50
    }
}
