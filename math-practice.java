public class Magic {
	public static void main(String[] args) {
    // This program print out whatever the first number you put in
    int myNumber = 3;
    int stepOne = myNumber * myNumber; 
    int stepTwo = stepOne + myNumber; 
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17; 
    int stepFive = stepFour - myNumber; 
    int stepSix = stepFive / 6; 
    System.out.println(stepSix);

	}
}