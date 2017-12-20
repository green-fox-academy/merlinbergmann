package entities.creatures;

import dev.merlinbergmann.rpg.Game;
import gfx.Animation;
import gfx.Assets;

import java.awt.*;

public class Player extends Creature {

  //Animations
  private Animation animPlayer;


  public Player(Game game, float x, float y) {
    super(game, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);

    animPlayer = new Animation(100, Assets.player);
  }
  @Override
  public void tick() {
    getInput();
    move();
    game.getGameCamera().centerOnEntity(this);
    //Animation
    animPlayer.tick();

  }

  private void getInput(){
    xMove = 0;
    yMove = 0;

    if (game.getKeyManager().up)
      yMove = -speed;
    if (game.getKeyManager().down)
      yMove = speed;
    if (game.getKeyManager().left)
      xMove = -speed;
    if (game.getKeyManager().right)
      xMove = speed;
  }

  @Override
  public void render(Graphics g) {

    g.drawImage(animPlayer.getCurrentFrame(), (int) (x - game.getGameCamera().getxOffset()), (int) (y - game.getGameCamera().getyOffset()),null);
  }
}
