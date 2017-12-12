public class MainGarden {
  public static void main(String[] args) {
    Garden myGarden = new Garden();
    Plant flower1 = new Flower("yellow");
    Plant flower2 = new Flower("blue");
    Plant tree1 = new Tree("purple");
    Plant tree2 = new Tree("orange");
    myGarden.addPlant(flower1);
    myGarden.addPlant(flower2);
    myGarden.addPlant(tree1);
    myGarden.addPlant(tree2);

    myGarden.irrigate(0);
    myGarden.irrigate(40);
    myGarden.irrigate(70);
  }
}