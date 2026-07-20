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
E
DE
CDE
BCDE
ABCDE
}
//ABEDE ABCD ABC AB A
int n = 5;
for(int i = 1; i<=n; i++){
    for(int j = 1; j<=i; j++)
        System.out.print((char)('A' +(n-i)+ (j -1)));
    System.out.println();
}

//Hollow Rectangle

int n = 4;
int m = 5;
for(int i = 1; i<=n; i++){
    for(int j = 1; j<=m; j++){
       if(i == 1 || j == 1|| i == n || j == m){
        System.out.print("*");

        
       }else{
        System.out.print(" ");
       }
       
    }
    System.out.println();
} 
//1 01 101 0101 10101
int n =5;
for(int i = 1; i<=n; i++){
    for(int j =1; j<=i; j++){
        if((i+ j) % 2 ==0){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
    System.out.println();
        
    } 
   //Floyd's Triangle
   int n = 5;
   int num = 1;
   
   for(int i = 1;i<=n; i++){
    for(int j = 1; j<=i; j++)
        System.out.print(num++ + " " );
    System.out.println();
   } 

int n = 5;
int m = 7;
for(int i = 1; i<=n; i++){
    for(int j = 1; j<=m; j++){
        if(i == 1 || j == 1 || i == n || j == m ){
            System.out.print("*");
        }
            
        else{
            System.out.print(" ");
        }
        
        
    }
    System.out.println();
        
} */
int n = 7;
int m = 7;
for(int i = 1; i<=n; i++){
    for(int j = 1; j<=m; j++){
        if(i ==1 || j == 1 || i == n || j == m || i == j || i + j == n + 1 ){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }
    System.out.println();
}
}
    }

