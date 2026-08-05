import java.util.Scanner;
public class function {
    /*public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[] ){
        System.out.print("Enter your Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMyName(name);
        sc.close();

        public static int sumOfNum(int a, int b ){
           int sum = a + b;
           return sum;
        }
       public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Num: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd num: ");
        int b = sc.nextInt();
        int sum = sumOfNum(a, b);
        System.out.println(sum);

        sc.close();

        public static int findSquare(int num){
            int Square = num * num;
            return Square;

        }
        public static void main(String args[]){
            System.out.print("Enter your num: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int Square = findSquare(num);
            System.out.println("Square is: " + Square);


       public static int findCube(int num){
        int Cube = num * num* num;
        return Cube;

       }
       public static void main(String args[]){
        System.out.print("Enter your num: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // num  = 2;
        int Cube = findCube(num);
        System.out.print("your Cube is : " + Cube);
    
    } 

        public static int findRectangleArea(int length, int breadth){
            int area = length * breadth;
            return area;
        }
        public static void main(String args[]){
            System.out.print("Enter your length: ");
            Scanner sc = new Scanner(System.in);
            int length = sc.nextInt();
            System.out.print("Enter your breadth: ");
            int breadth = sc.nextInt();
            int area = findRectangleArea(length, breadth);
            System.out.print("YOur area is : " + area);
        sc.close();
            } */
           public static void writeNum(int n ){
            
            for(int i = 1; i<=n; i++){
                System.out.print(i + " ");

            }

           }
           public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            writeNum(n);
            

            
        }

       } 

    

    

   /*returnType functionName(type arg1, type arg2..){
   operations
    */


