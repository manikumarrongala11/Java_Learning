public class NextedLoopsUsingPatteren{
    public static void main(String[] args){
/* 
        int n = 4;
        int m = 5;

        for(int i = 1; i<=n; i++){
            //inner Loop
            for(int j = 2; j<=m; j++ ){
                System.out.print("*");
            }
            System.out.println("*");
        } 
       // 2. Print the rectangle

       int n = 5;
       int m = 5;

       for(int i = 1; i<=n; i++){
        for(int j =1; j<m; j++ ){
            System.out.print("*");
        }
        System.out.println("*");
       } 
      /* int n = 5;
      for(int i = 1; i<=n; i++){

        for(int j = 1; j<=i; j++)

        System.out.print("*");
      
System.out.println();
} 

int n = 5;
for(int i = 1; i<=n; i++){
    for(int j = 1;j<= n -i +1; j++)
        System.out.print("*");

    System.out.println();
    
} 
int n = 5;
for(int i = 1; i<=n; i++){
    for(int j = 1; j<=i; j++)
        System.out.print(i);

        System.out.println();
    } 
        // for print A AB ABC ABCD ABCDE
int n = 5;
for(int i = 1; i<=n; i++){
    for(int j = 1; j<=i; j++)
        System.out.print((char)('A' + j -1));
    System.out.println();
}*/
//ABEDE ABCD ABC AB A
int n = 5;
for(int i = 1; i<=n; i++){
    for(int j = 1; j<=n - i +1; j++)
        System.out.print((char)('A' + j -1));
    System.out.println();
}

}
    }

