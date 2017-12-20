package gfx;

import java.awt.image.BufferedImage;

public class Assets {

  private static final int width = 64, height = 64;

  public static BufferedImage white, black, red, blue, yellow, monster2, boss;
  public static BufferedImage[] player, monster1;

    public static void init(){
      SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/Sprites64px.png"));
      SpriteSheet tileSheet = new SpriteSheet(ImageLoader.loadImage("/textures/mondrian.jpg"));

      white = tileSheet.crop(0, 0, width, height);
      black = tileSheet.crop(width, 0, width, height);
      red = tileSheet.crop(width * 2, 0, width, height);
      blue = tileSheet.crop(width * 3, 0, width, height);
      yellow = tileSheet.crop(0, height, width, height);

      player = new BufferedImage[11];
      player[0] = sheet.crop(0, 0, width, height);
      player[1] = sheet.crop(width, 0, width, height);
      player[2] = sheet.crop(width * 2, 0, width, height);
      player[3] = sheet.crop(width * 3, 0, width, height);
      player[4] = sheet.crop(width * 4, 0, width, height);
      player[5] = sheet.crop(width * 5, 0, width, height);
      player[6] = sheet.crop(width * 6, 0, width, height);
      player[7] = sheet.crop(width * 7, 0, width, height);
      player[8] = sheet.crop(width * 8, 0, width, height);
      player[9] = sheet.crop(width * 9, 0, width, height);
      player[10] = sheet.crop(width * 10, 0, width, height);

      monster1 = new BufferedImage[12];
      monster1[0] = sheet.crop(0, height, width, height);
      monster1[1] = sheet.crop(width, height, width, height);
      monster1[2] = sheet.crop(width * 2, height, width, height);
      monster1[3] = sheet.crop(width * 3, height, width, height);
      monster1[4] = sheet.crop(width * 4, height, width, height);
      monster1[5] = sheet.crop(width * 5, height, width, height);
      monster1[6] = sheet.crop(width * 6, height, width, height);
      monster1[7] = sheet.crop(width * 7, height, width, height);
      monster1[8] = sheet.crop(width * 8, height, width, height);
      monster1[9] = sheet.crop(width * 9, height, width, height);
      monster1[10] = sheet.crop(width * 10, height, width, height);
      monster1[11] = sheet.crop(width * 11, height, width, height);

      monster2 = sheet.crop(0, height * 2, width, height);
      boss = sheet.crop(0, height * 3, width, height);
    }
  }

