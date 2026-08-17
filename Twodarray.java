import java.util.Scanner;
public class Twodarray{
    /*Declaration
    type[][]arrayName = new type[rows][columns];
    int[][] numbers = new int[3][5] */ 
    /*public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
         int rows = sc.nextInt();
         int columns = sc.nextInt();
         int[][] number = new int[rows][columns];
         for(int i=0;i<rows; i++){
            for(int j=0;j<columns;j++){
                System.out.println("Enter the number " + "[" + i + "]" + "[" + j + "]" + " : ");
                number[i][j] = sc.nextInt();
            }
         }
         System.out.print("Enter which number u find: ");
         int x= sc.nextInt();
         for(int i =0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                if(number[i][j] == x){
                    System.out.println("Found at" + "[" + i + "]" + "[" + j + "]");
                }
            }
         }
    }
   public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int rows = sc.nextInt();
         int columns = sc.nextInt();
         int[][] number = new int[rows][columns];
         for(int i =0; i<rows; i++){
            //columns
            for(int j = 0; j<columns; j++){
                System.out.println("Enter num " + "[" + i + "]" + "[" + j + "]" + " : ");
                number[i][j] = sc.nextInt();
            }
            
            }
           int largest = number[0][0];
           for(int i = 0; i<rows; i++){
            for(int j =0; j<columns; j++){
                if(number[i][j] >largest){
                    largest = number[i][j];
                }
            }
           }
           System.out.println("largest num is : "+ largest);

        }

           public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int rows = sc.nextInt();
            int columns = sc.nextInt();
            int[][] number = new int[rows][columns];
// rows
            for(int i = 0; i<rows;i++){
                //columns
                for(int j =0; j<columns; j++){
                    number[i][j] = sc.nextInt();
                }
            }
            
            for(int j=0; j<columns;j++){
                int sum = 0;
                for(int i=0; i<rows;i++){
                    sum = sum + number[i][j];
                }
                System.out.println("sum = " + sum);
            }

           }   
          public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int rows = sc.nextInt();
            int columns = sc.nextInt();
            int[][] number = new int[rows][columns];
            for(int i = 0; i<rows;i++){
                for(int j =0; j<columns; j++){
                    number[i][j] = sc.nextInt();

                }
            }
            int count = 0;
            for(int i =0; i<rows; i++){
                for(int j =0; j<columns; j++){
                    if(number[i][j] % 2 == 0){
                        count++;
                    }
                }
                          }   
                          System.out.println("evrn num is :" + count);

            } 
           public static void main(String[] main){
            Scanner sc = new Scanner(System.in);
            int rows = sc.nextInt();
            int columns = sc.nextInt();
            int[][] number = new int[rows][columns];

            for(int i = 0; i<rows; i++){
                for(int j =0; j<columns; j++){
                    number[i][j] = sc.nextInt();
                    }
                 }
                 for(int i =0; i<rows; i++){
                    for(int j =0; j<columns; j++){
                        
                    }
                 }
                 int smallest =number[0][0];
                 for(int i =0; i<rows; i++){
                    for(int j = 0; j<columns; j++){
                        if(number[i][j] < smallest){
                            smallest = number[i][j];

                        }

                    }
                 }                    System.out.println("your smallest num:" + smallest);

            }*/
           public static void main(String[] args){
                 Scanner sc = new Scanner(System.in);
                 int rows = sc.nextInt();
                 int columns = sc.nextInt();
                 int[][] number = new int[rows][columns];

                 for(int i = 0; i<rows; i++){
                    for(int j =0; j<columns;j++){
                        number[i][j] = sc.nextInt();
                    }
                 }
                 int largest = number[0][0];
                 int secondlargest = number[0][0];
                 int thirdlargest = number[0][0];
                 int fourthlargest = number[0][0];
                 for(int i =0; i<rows; i++){
                    for(int j =0; j<columns;j++){
                        if(number[i][j]>largest){
                            fourthlargest = thirdlargest;
                            thirdlargest = secondlargest;
                            secondlargest = largest;
                            largest = number[i][j];                        
                        }else if(number[i][j]>secondlargest){
                            thirdlargest = secondlargest;
                            secondlargest = number[i][j];
                            
                        }else if(number[i][j]>thirdlargest){
                            fourthlargest =thirdlargest;
                            thirdlargest = number[i][j];

                        }else if(number[i][j]>fourthlargest){
                            fourthlargest=number[i][j];
                        }

                        }
                        

                        
                    }System.out.println("largest = "  + largest);
                 System.out.println("Second largest = " +secondlargest);
                 System.out.println("Third largest = " + thirdlargest );
                 System.out.println("Fourth largest = "+ fourthlargest);

                 }
                
           }
        

        