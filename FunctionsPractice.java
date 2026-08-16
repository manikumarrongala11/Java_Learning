import java.util.Scanner; 
public class FunctionsPractice{  /* 
    public static int sumOfNumbers(int n){
        int sum = 0;
       for( int i =1; i<=n; i++){
        sum = sum + i;
       }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your num: ");
        int a = sc.nextInt();
        int Sum = sumOfNumbers(a);
        System.out.println(Sum);

    } */

        public static int countEvenNumbers(int n){
            int count = 0;
            for(int i = 1; i<=n; i++){
                if(i % 2 == 0 ){
                    count++;
                }
            }
            return count;
        } 
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your num: ");
            int a = sc.nextInt();
            int count = countEvenNumbers(a);
            System.out.println("Your Ans IS :"+ count);
        }


}