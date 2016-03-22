import java.util.ArrayList; 

public class GradeAnalyzer {
  
  public GradeAnalyzer() {
  }
  
  public static int getAverage(ArrayList<Integer> grades) {
   
    int averageGrade; 
    if (grades.size() < 1) {
     System.out.println("Error! The size of grades is less than 1"); 
      return 0;
    } else {
     int sum = 0; 
     for (int i : grades) {
       sum = sum + i;
     }
     int average = sum / grades.size();
     System.out.println("the average grade is " + average);
     return average;
    } 
  }
  
  
  public static void main(String[] args){
    ArrayList<Integer> myClassroom = new ArrayList<Integer>();
    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);
    GradeAnalyzer myAnalyzer = new GradeAnalyzer(); 
    myAnalyzer.getAverage(myClassroom);
    
  } 
}