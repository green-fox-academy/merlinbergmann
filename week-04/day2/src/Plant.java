public class Plant {
  String color;
  int waterAbsorbed;
  int enoughWater;
  double absorbs;
  boolean needsWater = true;

  public boolean waterMe(int water){
    waterAbsorbed += water * absorbs;
    return waterAbsorbed <= enoughWater;
  }
}

