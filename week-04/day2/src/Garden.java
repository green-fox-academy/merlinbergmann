import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> plants;

  public Garden() {
    plants = new ArrayList<>();
  }

  public void addPlant(Plant plant) {
    plants.add(plant);
  }

  public void irrigate(int water) {
    System.out.println("Watering with " + water);

    List<Plant> plantsThatNeedWater = new ArrayList<>();

    for (Plant plant : plants) {
      if (plant.needsWater) {
        plantsThatNeedWater.add(plant);
        } else {
        plantsThatNeedWater.remove(plant);
      }
      }
    for (Plant needyPlant : plantsThatNeedWater) {
      needyPlant.waterMe(water / plantsThatNeedWater.size());
    }
    for (Plant plant : plants) {
      System.out.println(plant.toString());
    }
  }
}