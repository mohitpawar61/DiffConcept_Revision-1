public class method {
  static  int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }else{
            z= (x+y)*5;
        }
        x = 566;
        return z;

    }
    public static void main(String [] args){
        int a= 5;                                           // following method returns sum of two numbers
        int b= 7;                                      // int mySum(int a, intb){ int c= a+b; return C; }
        int c;
        //method innvocation using object cretion
        //method obj = new method();
      //  c = obj.logic(a,b);
        // calling a method - a method can be called an object of class in which method exists follwed by the method call:
        c = logic (a,b);
        System.out.println(a + ""+b);
        int a1= 2;
        int b1= 1;
        int c1;
        c1 = logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);

    }

}
