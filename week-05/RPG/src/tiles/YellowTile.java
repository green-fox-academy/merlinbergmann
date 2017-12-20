package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class YellowTile extends Tile {
  public YellowTile(int id) {
    super(Assets.yellow, id);
  }
  @Override
  public boolean isSolid(){
    return true;
  }
}
