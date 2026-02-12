public class methodoverloading {
    static void foo(){
        System.out.println("Good Morning bro!");
    }   static void foo(int a) {
        System.out.println("Good morning " + a + " Bro!");         //   method overloading- two or more methods can have same name but differnt parameters called
    }  static void foo(int a,int b) {
        System.out.println("Good morning " + a + " Bro!");        //   method overloading cannot be prepared by changing the return type of methods
        System.out.println("Good morning " + b + " Bro!");
    }  static  void change(int a){
        a = 98;
    }
    static  void change2(int []arr){
        arr[0]= 98;
    }
     static void tellJoke(){
         System.out.println("I invented a new world!\n"+"Plagiarism!");
        }
        public static void main (String[]args){
        // tellJoke();           // void - when we dont want our method to return anything we can use as the return type

   //  case 1 : changing the integer    // static keyword - Is used to associate a method given class with the class rather than the object. Static method in class is stored by all the objects.
//   int x = 55;
//   change(x);
//   System.out.println("The value of x after running change is!"+x);
            //  case 2 : changing the array // In the case of arrays the reference is passed same is the case of object passing to methods
//            int []marks = {25,30,36,45,58,65};
//   change2(marks);
//   System.out.println("The value of x after running change is!"+marks[0]);

// Method overloading
   foo();
   foo(3000);
            foo(3000,4000);
    // Arguments are actual!
    }
}
