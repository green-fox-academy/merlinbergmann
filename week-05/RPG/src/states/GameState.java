package states;

import dev.merlinbergmann.rpg.Game;
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

  public GameState(Game game){
    super(game);
    player = new Player(game, 200, 200);
    monster1 = new Monster(game, 450, 300);
    world = new World(game,"res/worlds/world1");


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
