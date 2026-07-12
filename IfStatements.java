public class IfStatements{
    public static void main(String[] args){

         double balance = 5000;
        double withdrawbalance = -100;

        if(withdrawbalance<=0){
            System.out.print("Invalid Amount");
        }
        else if(withdrawbalance>balance){
            System.out.println("Insufficient Amount");
        }
        else{
            balance = balance - withdrawbalance;
            System.out.println("Transastion Successful ");
            System.out.println("remaining balance: " + balance);
        } 

            int age = 40;
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