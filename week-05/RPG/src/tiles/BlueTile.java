package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

public class BlueTile extends Tile {
  public BlueTile(int id) {
    super(Assets.blue, id);
  }
  @Override
  public boolean isSolid(){
    return true;
  }
}
