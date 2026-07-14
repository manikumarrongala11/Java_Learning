import java.util.Scanner;
public class CompoundInterestCalculator {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //compount interest calculator

    double principle;
    double rate;
    int timesCompound;
    int years;
    double amount;

    System.out.print("Enter the principle");
    principle = sc.nextDouble();
    System.out.print("Rate of intrest");
    rate = sc.nextDouble() /100;

    System.out.print("No of times compound");
    timesCompound = sc.nextInt();

    System.out.print("NO of years");
    years = sc.nextInt();

    amount = principle * Math.pow(1 + rate / timesCompound, timesCompound);
    System.out.print("The actual amount After " + years + "is: $" + amount);





    sc.close();

}
    
}
