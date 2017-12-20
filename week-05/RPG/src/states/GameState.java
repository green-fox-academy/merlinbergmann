package states;

import dev.merlinbergmann.rpg.Game;
import dev.merlinbergmann.rpg.Handler;
import entities.creatures.Monster;
import entities.creatures.Player;
import gfx.Assets;
import tiles.Tile;
import worlds.World;

import java.awt.*;

public class GameState extends State{

  private Player player;
  private Monster monster1;

  private World world;

  public GameState(Handler handler){
    super(handler);
    world = new World(handler,"res/worlds/world1");
    handler.setWorld(world);
    player = new Player(handler, 200, 200);
    monster1 = new Monster(handler, 450, 300);



  }

  @Override
  public void tick() {
    world.tick();
    player.tick();
    monster1.tick();

  }

  @Override
  public void render(Graphics g) {
    world.render(g);
    player.render(g);
    monster1.render(g);
  }
}
