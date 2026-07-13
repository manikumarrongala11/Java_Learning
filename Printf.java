public class Printf{
    public static void main(String[] args){

        // printf() = ia a method used to format output
        // %[flags][width][.precision][specifier-character]

        String name = "manicoder";
        float height = 23.22f;
        double weight = 34.43;
        char price = '$';
        boolean qualified = true;


        System.out.printf("His name is %s\nHis Height is %.2f\nHis Weight is %.2f\nits Price is %c\nFinally he is Qualified: %b",name, height, weight, price, qualified);



    }
}