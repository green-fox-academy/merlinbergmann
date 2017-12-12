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
// Introducing a seperate list that stores only plants that are in need of water.
    List<Plant> plantsThatNeedWater = new ArrayList<>();

    for (Plant plant : plants) {
      if (plant.needsWater) {
        plantsThatNeedWater.add(plant);
        } else {
        plantsThatNeedWater.remove(plant);
      }
      }
    for (Plant needyPlant : plantsThatNeedWater) {
      needyPlant.waterMe(water / plantsThatNeedWater.size()); //this allocates an even amount of water to each plant.
    }
    for (Plant plant : plants) {
      System.out.println(plant.toString()); // prints out each plant's water status
    }
  }
}