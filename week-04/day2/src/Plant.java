// This superclass is needed so all types of plants can be stored in one list.
// This ensures that we can divide the total amount of water between all of them.

public class Plant {
  String type;
  String color;
  double waterAbsorbed = 0;
  double enoughWater;
  double absorbs;
  boolean needsWater = true;

  public boolean waterMe(int water){
    waterAbsorbed += (double) water * absorbs;
    if (waterAbsorbed >= enoughWater){
      needsWater = false;
    }
    return waterAbsorbed <= enoughWater;
  }
  @Override
  public String toString() {
    String waterState =  ((waterAbsorbed >= enoughWater) ? "doesn't need water" : "needs Water");
    return "The "+ color + " " + type + " " + waterState;
  }
}

