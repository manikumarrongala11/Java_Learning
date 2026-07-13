/*public class MathClass {
    public static void main(String[] args){
        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        double result;

        result = Math.pow(2,5);
        
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(3.14);
        result = Math.floor(3.14);
        result = Math.max(12, 23);
        result = Math.min(23, 56);
        
        

        System.out.println(result);


    }
}
*/
import java.util.Scanner;
public class MathClass{
    public static void main(String[] args){
        //HYPOTENUSE c = math.sqrt(a² + b²)
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter side a: ");
        a = sc.nextDouble();

        System.out.print("Enter side B : ");
        b = sc.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("the Hypotenuse is (side c) " + c + "cm");





        sc.close();


    }
}