public class introduction {
    public static void main(String[] args) {
       //classroom of 500 student- you have to store marks of these 500 students
        //you have 2 option:
        //1._Create_500_variables_
        //2.use arrays(recommended)    //array is collection of similar types of data
        //1.declaration and memory allocation
        // int []marks = new int[5];
        //2.declaration and then memory allocation
//    int []marks ;
//   marks= new int[5];
//        //initialization                                 // you can write three type as follows:
//        marks[0]=100;                   // int[]marks; - declaration , marks= new int[5];-memory allocation
//        marks[1]=100;                   //int[]marks = new int[5]; - declaration+ memory allocation!
//        marks[2]=70;                   // int [] marks = {100,70,80,71,98} - declare + initialize!
//        marks[3]=90;
//        marks[4]=60;        // an arrays store the value output are correct but overvalue eg.array marks[5] then you can store the 5 value output not value [6]
    //3.declaration, memory allocation and initialization together
     int []marks = {98,45,79,99,88};

     System.out.println(marks[4]);

    }
}