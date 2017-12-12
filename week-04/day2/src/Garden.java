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

    List<Plant> plantsThatNeedWater = new ArrayList<>();

    for (Plant plant : plants) {
      if (plant.needsWater) {
        plantsThatNeedWater.add(plant);

        for (Plant needyPlant : plantsThatNeedWater) {
          needyPlant.waterMe(water / plantsThatNeedWater.size());
        }
      }
    }
  }
}