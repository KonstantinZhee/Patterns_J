package Patterns.Structural.Decorator.Example;

import Patterns.Structural.Decorator.Example.Products.Beverage;
import Patterns.Structural.Decorator.Example.Products.DarkRoast;
import Patterns.Structural.Decorator.Example.Products.Espresso;
import Patterns.Structural.Decorator.Example.Supplements.Milk;
import Patterns.Structural.Decorator.Example.Supplements.Soy;

public class Decorator {

  public static void main(String[] args) {
    Beverage myDrinks = new DarkRoast();

    System.out.println(myDrinks.getDescription() + "That will be cost " + myDrinks.cost());

    //Add some milk with Soy in drink
    myDrinks = new Milk(myDrinks);
    myDrinks = new Soy(myDrinks);

    //Or we can do like that
    Beverage drink1 = new Milk(new Milk(new Soy(new Espresso())));

    System.out.println(myDrinks.getDescription() + "That will be cost " + myDrinks.cost());


  }


}
