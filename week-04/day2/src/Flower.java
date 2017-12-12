public class Flower extends Plant {
  public Flower() {
    type = "Flower";
    absorbs = 0.75;
    color = "green";
    enoughWater = 5;
  }
  public Flower(String color){
    this.color = color;
    type = "Flower";
    absorbs = 0.75;
    enoughWater = 5;
  }

}

