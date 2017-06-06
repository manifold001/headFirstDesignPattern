package introduction

/**
 * Created by yzhao on 6/6/17.
 */

abstract class Duck {
    open var flyBehavior: FlyBehavior? = null
        set(value) {
            field = value
        }
    var quackBehavior: QuackBehavior? = null
        set(value) {
            field = value
        }

    open abstract fun display()

    fun performFly() {
        this.flyBehavior!!.fly()
    }

    fun performQuack() {
        this.quackBehavior!!.quack()
    }

    fun swim() {
        println("All ducks float, event decoys.")
    }
}


class MallardDuck: Duck() {
    init {
        flyBehavior = FlyWithWings()
        quackBehavior = Quack()
    }

    override fun display() {
        println("I'm a Mallard Duck")
        performFly()
        performQuack()
        swim()
        this.quackBehavior = MuteQuack()
        performQuack()
    }
}

class ModelDuck: Duck() {
    init {
        flyBehavior = FlyNoWay()
        quackBehavior = Quack()
    }

    override fun display() {
        println("I'm a model duck")
    }
}

