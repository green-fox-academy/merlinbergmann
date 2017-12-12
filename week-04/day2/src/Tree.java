public class Tree extends Plant {
  public Tree() {
    type = "Tree";
    absorbs = 0.4;
    color = "green";
    enoughWater = 10;
  }
  public Tree(String color){
    this.color = color;
    type = "Tree";
    enoughWater = 10;
    absorbs = 0.4;
  }

}
