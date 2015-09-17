package com.company;

import com.company.Arrays.Arrays;


public class Main {

    public static void main(String[] args) {

	// write your code here
//        int [] arr = new int []{100, 102, 104, 132, 2, 34, 1223};
       Arrays mA = new Arrays();
        int [][] a = {{10, 8, 12 }, { 11, 8, 11}};
        int [][] b = {{ 1250 }, { 400}};
        mA.arrange(a);
        mA.arrange(b);
       int[][] result = mA.multiply(a,b);
        mA.arrange(result);
//        mA.binarySort(arr);
//       mA.binarySearch(arr, 1224);
//        String [] days = new String[]{"Mon", "Tue", "Wed", "Thurs", "Fri", "Sat", "Sun"};
//        System.out.println("Days of the month are:");
//        for(i = 0; i <= days.length-1; i++){
//            System.out.println(days[i]);

//
//        }
//        double [][] temps = new double[][]{{25.6, 56.7, 7.89},{25.6, 56.7,0.0}};
//        for(int i =0; i< temps.length; i++){
//            for (int j = 0; j< temps[1].length; j++)
//                System.out.print(temps[i][j]+ " ");
//
//            System.out.println();
//        }


    }
}
