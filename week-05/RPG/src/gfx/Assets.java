package gfx;

import java.awt.image.BufferedImage;

public class Assets {

  private static final int width = 64, height = 64;

  public static BufferedImage background, player, monster1, monster2, boss;


    public static void init(){
      background = ImageLoader.loadImage("/textures/mondrian1.jpg");
      SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/Sprites64px.png"));

      player = sheet.crop(0, 0, width, height);
      monster1 = sheet.crop(0, height, width, height);
      monster2 = sheet.crop(0, height * 2, width, height);
      boss = sheet.crop(0, height * 3, width, height);
    }
  }

