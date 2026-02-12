public class praticeset {
    public static void main(String[]args){
        // 1) Crete an array of 5 flats and calculate their sum
//        float [] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
//        float sum = 0;
//        for (float element:marks){
//            sum=sum + element;
//        }
//        System.out.println("the value of sum is"+sum);

//        // 2) write an array to find out whether a given integer is present in an array or not
//        float [] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
//        float num= 45.7f;
//        boolean isInArray = false;
//        for (float element:marks){
//            if(num==element){
//                isInArray=true;
//                break;
//            }
//        }
//        if(isInArray) {
//            System.out.println("the value is present in the array");
//        }
//        else{
//            System.out.println("the value is not present in the array");
//        }
        // 3)calculate the average marks from an array containing marks of all students in physics using for-each loop
//        float [] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
//        float sum = 0;
//        for (float element:marks){
//            sum=sum + element;
//        }
//        System.out.println("the value of average marks is"+sum/marks.length);

   // 4) create a java program to add two matrices of size  2*3
//    int [][] mat1={{1,2,3},
//                  {4,5,6}};
//    int [][] mat2={{2,7,8},
//                {9,10,12}};
//    int [][] result={{0,0,0},
//                   {0,0,0}};
//   for(int i=0;i<mat1.length;i++) {    //row no of times
//       for (int j = 0; j < mat1[i].length; j++) {  //column no of times
//           System.out.format("Setting value for i=%d and j=%d\n", i, j);
//           result[i][j] = mat1[i][j] + mat2[i][j];
//       }
//   }
//  //printing the elements of a2-d array
//        for(int i=0;i<mat1.length;i++){    //row no of times
//            for(int j=0;j<mat1[i].length;j++) {  //column no of times
//                System.out.print(result[i][j]+" ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//       }
//            System.out.println("");
//       }
        // 5)write a java program to reverse array

//     int[]arr= {1,2,3,4,5,6};
//     int l = arr.length;
//     int n = Math.floorDiv(arr.length, 2);
//   int temp;
//     for(int i=0; i<n; i++) {
//         // swap a[i] and a[l-1-i]
//         // a   b   temp
//         //    |4|    |5|  ||
//         temp = arr[i];
//         arr[i] = arr[l - i - 1];
//         arr[l - i - 1] = temp;
//     }
//     for(int element:arr){
//         System.out.print(element + " ");
//     }

        // 6) Write a java program to find the maximum element in an array
//   int []arr = {1,21,3,455,5,34,67};
//  int max = 0;
//   for(int element:arr){
//       if(element>max){
//           max = element;
//       }
//   }
//   System.out.println("the value of the maximum element in this array is:"+ max);

       // 7) write a java program to find the minimum element in an array
//        int []arr = {1,21,3,455,5,34,67};
//  int min = Integer.MAX_VALUE;
//   for(int element:arr){
//       if(element<min){
//           min = element;
//       }
//   }
//   System.out.println("the value of the minimum element in this array is:"+ min);

        //8) Write a java program to find whether an array is sorted or not
//        boolean isSorted = true;
//        int []arr = {1,2100,3,455,5,34,67};
//       for (int i=0;i<arr.length-1;i++){
//           if (arr[i]>arr [i+1]){                                              // array not sorted
//               isSorted = false;
//               break;
//           }
//       }
//      if (isSorted){
//          System.out.println("the array is sorted");
//      }else{
//          System.out.println("the array is not sorted");
//      }
        boolean isSorted = true;
        int []arr = {1,2,3,4,5,34,67};
        for (int i=0;i<arr.length-1;i++){                   // array sorted
            if (arr[i]>arr [i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("the array is sorted");
        }else{
            System.out.println("the array is not sorted");
        }


    }
}
