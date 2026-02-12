public class practise_set {
//    static void multiplication(int n){
//        for (int i=1;i<=10;i++){
//            System.out.format("%d * %d = %d\n", n, i, n*i);
//        }
//    }
    static void pattern1(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){     // print reverce star then type (n-i) & print normal star then (i+1)
                System.out.print("*");
            }
           System.out.println();
        }
    } static void pattern1_Rec(int n){

       if(n>0){
           pattern1_Rec(n-1);
           for(int i=0; i<n;i++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
    // sum(n) = 1+2+3..+n-1 +n
    static int sumRec(int n){
        // Base condition
        if (n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }
    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
//        if (n==1 || n==2){
//            return n-1;
//        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
        //problem 1- write a java method to print multiplication table of a number n.
     //  multiplication(7);

       // problem 2- write a program using function to print the following pattern:
        // *
        // * *
        // * * *
        // * * * *
 //   pattern1(4);

    // problem 3- write a recursive function to calculate sum of first n natural numbers
   //    int c = sumRec(3);
 //  System.out.println(c);

    // problem 4- write a function to print the following pattern
    // * * * *
    // * * *
    // * *
    //*
 //pattern1(4);
     // problem 5- write a function to print nth term of fibonacci series using recursion
     // fibonacci series - 0,1,1,2,3,5,8,13,21,34
  //  int result = fib(5);
  //  System.out.println(result);

    // problem 6- write a function to find average of a set of numbers passed as arguments

   //problem 7 - repeat 4 using recursion



        //problem 8 - repeat 2 using recursion
        pattern1_Rec(4);


        // problem 9 - write a function convert celsis temperature into fahrenheit


        // Repeat 3 using iterative approach



    }
}
