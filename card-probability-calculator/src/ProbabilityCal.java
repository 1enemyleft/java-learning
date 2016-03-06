
import java.util.Scanner;

public class ProbabilityCal
{
    public static void main(String args[])
    {
        //taking value as command line argument.
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter Total Card Number:  ");
        int totalNumber = in.nextInt();
        System.out.printf("Enter Specific Card Total Number:  ");
        int cardCount = in.nextInt();
        System.out.printf("Enter the expected draw on specific card:  ");
        int drawCount = in.nextInt();

        long denominator = totalNumber-drawCount+1;

        for(int i=totalNumber-drawCount+2; i<=totalNumber; ++i){
            denominator = denominator * i;
        }
        //System.out.println("the denominator is " + denominator);

        long numerator = cardCount-drawCount+1;
        for(int i=cardCount-drawCount+2; i<=cardCount; ++i){
            numerator = numerator*i;
        }
        //System.out.println("the numerator is " + numerator);

        double probability = (double)numerator/(double)denominator;
        System.out.println("The chance of drawing "+ drawCount +" out of " + cardCount + " is " + probability*100 + "% percentage");

    }
}
