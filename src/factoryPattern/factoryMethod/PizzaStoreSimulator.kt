package factoryPattern.factoryMethod

import factoryPattern.PizzaType


fun main(args: Array<String>) {
   print("Order a CheesePizza from New York Pizza Store")
   val nyPizzaStore = NYPizzaStore()
   nyPizzaStore.orderPizza(PizzaType.CheesePizza)

   println("Order a GreekPizza from Chicago Pizza Store")
   val chicagoPizzaStore = ChicagoPizzaStore()
   chicagoPizzaStore.orderPizza(PizzaType.GreekPizza)
}

