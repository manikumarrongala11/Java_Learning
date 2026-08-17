import java.util.Scanner;
public class Strings {
    public static void main(String[] args){
        //String Declaration
        Scanner sc = new Scanner(System.in);
        //concatenation
        String name = "manii";
        String university = "LOVELY UNV";
        String fullname = name + university;
        // for length string name.length
        System.out.println(fullname.length());
        //charAt
        for(int i = 0; i<fullname.length(); i++){
            System.out.print(fullname.charAt(i) + " ") ;
        }



        

    }
    
}
