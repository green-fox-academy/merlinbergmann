public class Tree extends Plant {
  public Tree() {
    absorbs = 0.4;
    color = "green";
  }
  public Tree(String color){
    this.color = color;
  }

  @Override
  public String toString() {
    String waterState =  ((waterAbsorbed > enoughWater) ? "doesn't need water" : "needs Water");
    return "The "+ color + " tree " + waterState;
  }
}
