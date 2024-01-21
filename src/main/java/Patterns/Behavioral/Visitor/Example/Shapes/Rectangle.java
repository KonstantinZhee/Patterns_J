package Patterns.Behavioral.Visitor.Example.Shapes;

import Patterns.Behavioral.Visitor.Example.Visitors.Visitor;

public class Rectangle extends Shape {

  private int x;
  private int y;

  public Rectangle(String name, int x, int y) {
    super(name);
    this.x = x;
    this.y = y;
  }

  public void rotate() {
    System.out.println("Vgux vgux NAME: " + name);
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
