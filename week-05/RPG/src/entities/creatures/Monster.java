package entities.creatures;

import dev.merlinbergmann.rpg.Game;
import dev.merlinbergmann.rpg.Handler;
import gfx.Animation;
import gfx.Assets;

import java.awt.*;

public class Monster extends Creature {
  //Animations
  private Animation animMonster1;


  public Monster(Handler handler, float x, float y) {
    super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);

    animMonster1 = new Animation(100, Assets.monster1);
  }

  @Override
  public void tick() {
    //Animation
    animMonster1.tick();

  }

  @Override
  public void render(Graphics g) {
    g.drawImage(animMonster1.getCurrentFrame(), (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()),null);
  }
}
