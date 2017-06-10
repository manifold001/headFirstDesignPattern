package factoryPattern.abstractFactory

interface Dough {
    open val description: String
}

class NYDough: Dough {
    override val description: String = "NY Dough"
}

class ChicagoDough: Dough {
    override val description: String
        get() = "Chicago Dough"
}

interface Source {
    open val description: String
}

class NYSource: Source {
    override val description: String
        get() = "NY Source"
}

class ChicagoSource: Source {
    override val description: String
        get() = "Chicago Source"
}

interface PizzaIntegredientFactory {
    fun createDough(): Dough

    fun createSauce(): Source
}

class NYPizzaIntegredientFactory: PizzaIntegredientFactory {
    override fun createDough(): Dough {
        return NYDough()
    }

    override fun createSauce(): Source {
        return NYSource()
    }
}

class ChicagoPizzaIntegredientFactory: PizzaIntegredientFactory {
    override fun createDough(): Dough {
        return ChicagoDough()
    }

    override fun createSauce(): Source {
        return ChicagoSource()
    }
}
