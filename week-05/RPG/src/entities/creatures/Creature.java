package entities.creatures;

import entities.Entity;

import java.awt.*;

public class Creature extends Entity {

  protected int health;

  public Creature(float x, float y) {
    super(x, y);
    health = 10;
  }

  @Override
  public void tick() {

  }

  @Override
  public void render(Graphics g) {

  }
}
