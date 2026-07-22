import java.util.*;
public class Functions {
    //Block of code which performs the specific code
    //returnType functionName(type arg1, type arg2..){
    //operations
    //public static returnType functionName(parameters) {
    // code

    // 1. Print a given name in a function

    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you name : ");
        String name = sc.nextLine();
        
        printMyName(name);
    
    }
    
}
