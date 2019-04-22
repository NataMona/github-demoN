package student;
public class Student {

  private String name;
  private int rating;

  private static int studentsCount = 0;
  private static double avgRating = 0.0d;

  public Student() {
    studentsCount++;
  }

  public Student(String name) {
    this();
    this.name = name;
  }

  public static double getAvgRating() {
    return avgRating;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    avgRating = (avgRating * (studentsCount - 1) + rating) / studentsCount;
    this.rating = rating;
  }

  public boolean betterStudent(Student student) {
    return this.rating > student.getRating();
  }

  public void changeRating(int rating) {
    avgRating = (avgRating * studentsCount + rating - this.rating) / studentsCount;
    this.rating = rating;
  }

  public static void removeStudent(Student student) {
    if (studentsCount == 1) {
      avgRating = 0.0;
    } else {
      avgRating = (avgRating * studentsCount - student.getRating()) / (studentsCount - 1);
    }
    studentsCount--;
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", rating=" + rating +
            '}';
  }
}
