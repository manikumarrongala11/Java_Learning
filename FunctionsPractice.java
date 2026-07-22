import java.util.Scanner;
public class FunctionsPractice{

    public static int calculateSum(int a, int b){
        System.out.println("Final sum is: " + (a + b));
        int sum = a +b;
        return sum;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter two numbers: ");   
        int  a = sc.nextInt();
        int b = sc.nextInt();
       int sum = calculateSum(a, b);
       
       

        sc.close();

    }
}