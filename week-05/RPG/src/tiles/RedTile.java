package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class RedTile extends Tile {
  public RedTile(int id) {
    super(Assets.red, id);
  }

  @Override
  public boolean isSolid(){
    return true;
  }

}
