public class IfStatements{
    public static void main(String[] args){

        /* double balance = 5000;
        double withdrawAmount = -100;

        if(withdrawAmount<=0){
            System.out.print("Invalid Amount");
        }
        else if(withdrawAmount>balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance = balance - withdrawAmount;
            System.out.println("Transastion Successful ");
            System.out.println("remaining balance: " + balance);
        } */

            int age = 30;
            boolean hasID = true;

            if(age<0 || age>120){
                System.out.println("INVALID AGE !");
            }
             else if(age<18){
                                System.out.println("Entry Denied Sorry");



            }
            else if(age>=18 && !hasID)
            {

                                System.out.println("Bring a Valid ID");

            }
            else{
                                System.out.println("Entry Allowed");

            }


    }
}