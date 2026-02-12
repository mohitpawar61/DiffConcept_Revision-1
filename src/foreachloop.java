public class foreachloop {
    public static void main(String[]args){
      //  int []marks = {98,45,79,99,88};
       // System.out.println(marks.length);
//        float []marks = {98.5f,45.5f,79.5f,99.5f,88.f};
//        System.out.println(marks.length);
//       String []students = {"mohit","shubham","rohan","aniket"};
//       System.out.println(students.length);
//       System.out.println(students[2]);
        int []marks = {98,45,79,99,88};
//        System.out.println(marks.length);
// displaying the array (naive way)
        System.out.println("printing using naive method");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //displaying the array (for loop)
        System.out.println("printing using for loop");
  for(int i=0;i<marks.length;i++ ){
      System.out.println(marks[i]);
  }
        //displaying the array in reverse order (for loop)
  // write a java program to print the element of an array in reverse order
        System.out.println("printing using for loop in reverse order");
        for(int i= marks.length-1;i>=0;i-- ){
            System.out.println(marks[i]);
        }
// for each loop in java:
        //sytax - for (int element : Arr){ Sout(element);}
        System.out.println("printing using for-each loop");
        for(int element:marks){
            System.out.println(element);
        }
    }
}
