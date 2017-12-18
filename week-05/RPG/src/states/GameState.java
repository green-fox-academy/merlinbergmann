package states;

import dev.merlinbergmann.rpg.Game;
import entities.creatures.Player;
import gfx.Assets;

import java.awt.*;

public class GameState extends State{

  private Player player;

  public GameState(Game game){
    super(game);
    player = new Player(0, 26);
  }

  @Override
  public void tick() {
    player.tick();
  }

  @Override
  public void render(Graphics g) {
    g.drawImage(Assets.background, 0, 0, null);
    player.render(g);
  }
}
