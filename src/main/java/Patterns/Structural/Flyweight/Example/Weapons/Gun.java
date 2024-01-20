package Patterns.Structural.Flyweight.Example.Weapons;

import Patterns.Structural.Flyweight.Example.Elements.Bullet;
import Patterns.Structural.Flyweight.Example.Elements.BulletFactory;
import Patterns.Structural.Flyweight.Example.Elements.BulletType;

import java.util.ArrayList;
import java.util.List;

public class Gun {

  private List<Bullet> bullets = new ArrayList<>();

  public void fire() {
    BulletType bulletType = BulletFactory.getBulletType("simple_bullet", "GunSprite.png");
    Bullet bullet = new Bullet(200, bulletType);
    bullets.add(bullet);
    System.out.println("Bullet was add to game");
  }
}
