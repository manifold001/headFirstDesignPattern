package introduction


open interface FlyBehavior {
    open fun fly()
}

class FlyWithWings: FlyBehavior {
    override fun fly() {
        println("I'm flying with wings!")
    }
}

class FlyNoWay: FlyBehavior {
    override fun fly() {
        println("I cannot fly!")
    }
}

class FlyRocketPowered: FlyBehavior {
    override fun fly() {
        println("I'm flying with a rocket!")
    }
}
