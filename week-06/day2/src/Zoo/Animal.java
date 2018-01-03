package Zoo;

public abstract class Animal {
  String name;
  String gender;
  int age;
  int weight;

  public abstract void breed();
  public abstract void move();

  public String getName() {
    return name;
  }
}
