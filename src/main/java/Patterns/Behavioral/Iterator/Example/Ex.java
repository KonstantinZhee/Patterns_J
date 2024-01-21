package Patterns.Behavioral.Iterator.Example;

import Patterns.Behavioral.Iterator.Example.Menus.DinnerMenu;
import Patterns.Behavioral.Iterator.Example.Menus.PancakeMenu;

public class Ex {

  public static void main(String[] args) {
    PancakeMenu pancakeMenu = new PancakeMenu();
    DinnerMenu dinnerMenu = new DinnerMenu();

    Waitress waitress = new Waitress();
    waitress.addMenu(pancakeMenu);
    waitress.addMenu(dinnerMenu);

    waitress.printMenu();
  }

}
