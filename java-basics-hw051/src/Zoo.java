import java.util.List;

public class Zoo {

  /**
   * Feeds different bird sections of the zoo.
   *
   * @param list list of birds of particular type
   */
  public static void feed(List list) {
    // TODO fix method declaration
    System.out.println("Feeding birds");
    // TODO print birds in the cycle
    for (int i = 0; i < list.size(); i++){
      list.get(i).toString();
    }
  }

  /**
   * Adds birds to a flying section of the zoo.
   *
   * @param list list of birds of particular type
   * @param bird new bird
   */
  public static void acceptBird(List list, FlyingBird bird) {
    // TODO fix method declaration
    System.out.println("Accepting bird to a section");
    // TODO check flying bird wings
    // TODO add bird to the list and print it
    bird.checkWings();
    list.add(bird);
    System.out.println(bird.toString());
  }

  /**
   * Adds bird to the general list.
   *
   * @param list    list of birds
   * @param newBird bird to add
   */
  public static void registerBird(List list, Bird newBird) {
    // TODO fix method declaration
    System.out.println("Adding bird to the birds list");
    // TODO add bird to list
    // TODO print birds in the cycle
    list.add(newBird);
    for (int i = 0; i < list.size(); i++){
      list.get(i).toString();
    }
  }
}