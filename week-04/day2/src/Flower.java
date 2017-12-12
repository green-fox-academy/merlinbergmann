public class Flower extends Plant {
  public Flower() {
    absorbs = 0.75;
    color = "green";
  }
  public Flower(String color){
    this.color = color;
  }

    @Override
    public String toString() {
      String waterState =  ((waterAbsorbed > enoughWater) ? "doesn't need water" : "needs Water");
      return "The "+ color + " flower " + waterState;
    }
  }

