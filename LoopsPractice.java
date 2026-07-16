import java.util.Scanner;
public class LoopsPractice{
   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

System.out.print("Enter a number:");
int n = sc.nextInt();
for(int i =1; i <=10; i++){
   if((n * i) % 2 == 0){
      System.out.println("Even: " + n + " * " + i + " = " + (n * i));
   }
   else {
      System.out.println("Odd: " + n + " * " + i + " = " + (n * i) );
   }
   
}
     

      


      sc.close();




   }

}