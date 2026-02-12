public class multidimensionalarray {
    public static void main(String[]args){
      //multidimensional array are array of arrays
       int []marks; //A 1-d array
        int[][]flats; // A 2-d array
        flats=new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        //displaying the array 2-d Array(for loop)
        System.out.println("printing a 2-d array using for loop");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
            System.out.print(flats[i][j]);
            System.out.print(" ");
            }
          System.out.println("");
        }

    }
}
