package dev.merlinbergmann.rpg;

import display.Display;
import gfx.Assets;
import gfx.ImageLoader;
import gfx.SpriteSheet;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Game implements Runnable {

  private Display display;
  public int width, height;
  public String title;

  private boolean running = false;
  private Thread thread;

  private BufferStrategy bs;
  private Graphics g;


  public Game(String title, int width, int height){
    this.width = width;
    this.height = height;
    this.title = title;


  }
  private void init(){
    display = new Display(title, width, height);
    Assets.init();
  }
  int x = 0;

  private void tick(){
    x += 1;

  }
  private void render(){
    bs = display.getCanvas().getBufferStrategy();
    if (bs == null){
      display.getCanvas().createBufferStrategy(3);
      return;
    }
    g = bs.getDrawGraphics();
    //Clear Screen
    g.clearRect(0, 0, width, height);

    // Draw Here!

    g.drawImage(Assets.background, 0, 0, null);
    g.drawImage(Assets.player, x, 26, null);

    // End Drawing!
    bs.show();
    g.dispose();
  }

  public void run(){
    init();

    int fps = 60;
    double timePerTick = 1000000000 / fps;
    double delta = 0;
    long now;
    long lastTime = System.nanoTime();

    while(running) {
      now = System.nanoTime();
      delta += (now - lastTime) / timePerTick;
      lastTime = now;

      if (delta >= 1) {
        tick();
        render();
        delta--;
      }
    }

    stop();

  }

  public synchronized void start(){
    if (running)
      return;
    running = true;
    thread = new Thread(this);
    thread.start();
  }

  public synchronized void stop(){
    if (!running)
      return;
    running = false;
    try {
      thread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }

}
