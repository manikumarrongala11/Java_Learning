public class NextedIfStatements {

    public static void main(String[] args) {

        boolean cardInserted = true;
        boolean pinCorrect = true;

        double balance = 5000;
        double withdrawAmount = 2000;

        if (cardInserted) {

            if (pinCorrect) {

                if (withdrawAmount <= balance) {

                    balance -= withdrawAmount;

                    System.out.println("Transaction Successful");
                    System.out.println("Remaining Balance: ₹" + balance);

                } else {

                    System.out.println("Insufficient Balance");

                }

            } else {

                System.out.println("Incorrect PIN");

            }

        } else {

            System.out.println("Please Insert Your Card");

        }

    }
}