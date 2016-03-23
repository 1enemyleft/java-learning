import java.util.ArrayList;

public class GradeAnalyzer {

  private double weight;

  public GradeAnalyzer() {
    weight = 1.0;
  }

  public GradeAnalyzer(double weight) {
    this.weight = weight;
  }

  public double getAverage(ArrayList<Integer> grades) {
    double average;

    if (grades.size() < 1) {
      System.err.println("Error! The size of grades is less than 1");
      average = 0.0;
    } else {
      int sum = 0;
      for (int i : grades) {
        sum += i;
      }

      average = sum / grades.size();
    }

    System.out.println("the average grade is " + average);
    return average * this.weight;
  }


  public static void main(String[] args) {
    ArrayList<Integer> myClassroom = new ArrayList<Integer>();
    GradeAnalyzer myAnalyzer = new GradeAnalyzer(0.5);

    myClassroom.add(98);
    myAnalyzer.getAverage(myClassroom);
    myClassroom.add(92);
    myAnalyzer.getAverage(myClassroom);
    myClassroom.add(88);
    myAnalyzer.getAverage(myClassroom);
    myClassroom.add(75);
    myAnalyzer.getAverage(myClassroom);
    myClassroom.add(61);
    myAnalyzer.getAverage(myClassroom);
    myClassroom.add(89);
    myAnalyzer.getAverage(myClassroom);
    myClassroom.add(95);
    myAnalyzer.getAverage(myClassroom);

  }
}