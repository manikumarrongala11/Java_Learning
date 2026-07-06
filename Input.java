
/*import java.util.Scanner;


public class Input{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("naam kya hai tumra : ");
            String name = scanner.nextLine();
            System.out.println(name + " acha ");
             scanner.close();

        

    }
}
     */

import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        // area of rectange
        double height = 0;
        double width = 0;
        double area = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height: ");
        height = sc.nextDouble();

        System.out.print("Enter the width ");
        width = sc.nextDouble();


        area = height  * width;
        System.out.println("area is " + area + "cm²");
         sc.close();







    }


}
  