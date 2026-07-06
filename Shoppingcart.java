import java.util.Scanner;
public class Shoppingcart {
    public static void main(String[] args){


        //shopping cart program

        Scanner sc = new Scanner(System.in);

        String item;
        System.out.print("what item that you buy : ");
        item = sc.nextLine();
        double price;
        System.out.print("what is the Price for each : ");
        price = sc.nextDouble();

        int quantity;
        System.out.print("how many would you like?: ");
        quantity = sc.nextInt();
        char currency = '$';

        double total;
        total = price * quantity;
        System.out.print("your Bill is : " + currency + total + " THANK YOU VISIT AGAIN..." );

               


        sc.close();

    }
    
}
