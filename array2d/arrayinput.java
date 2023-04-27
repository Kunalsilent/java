package array2d;

// to take input for 2d array and print 2d array 

import java.util.Scanner;



public class arrayinput {

    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt();
       int cols = sc.nextInt();

       int[][] numbers = new int[rows][cols];
        //input 
        for(int i=0;i<rows;i++){
            //columns
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        //output prinbt karwane ke liye 
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
              System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

    }


}

