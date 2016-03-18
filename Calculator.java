public class Calculator{
  //this program is creating a calculator with few functions. 
  
  public Calculator() { 
  }

  // add
  public static int add(int a, int b) {
    int c = a + b;
    return c;
  }
  
  // subtract
  public static int subtract(int a, int b) {
    int c = a - b;
    return c;
  }
  
  //multiply
  public static int multiply(int a, int b) {
    int c = a * b;
    return c;
  }
  
  //divide
  public static int divide(int a, int b) {
    int c; 
    if (b == 0){
      System.out.println("Error! Dividing by zero is not allowed");
    	c = 0;
    } else {
 		  c = a / b;
    }
    return c;
  }
  
  //modulo
  public static int modulo(int a, int b) {
    int c;
    if (b == 0){
      System.out.println("Error! Dividing by zero is not allowed");
    	c = 0;
    } else {
 		  c = a % b;
    }
    return c;
  }
  
  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45, 11));
  }
  
}