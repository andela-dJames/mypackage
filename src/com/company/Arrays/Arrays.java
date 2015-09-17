package com.company.Arrays;

/**
 * Created by Daniel James on 9/15/2015.
 */
public class Arrays {
    public Arrays(){

    }
    public void linearSearch(int[] arr, int item){

        int i, count =0;

        for (i=0; i <= arr.length-1; i++){
            if(arr[i]== item){
                count++;
            }
        }
        if(count ==0){
            System.out.println(" not found in the given array");
        }
        else
        System.out.println(item +", found "+ count +" matches for "+item);
    }
    public void binarySearch(int[] arr, int item){
        int lIndex = 0;
        int hIndex = arr.length-1;
        int mIndex;

        while(lIndex <= hIndex){
            mIndex = (lIndex+hIndex)/2;
            if(item > arr[mIndex]){
                lIndex = mIndex + 1;
            }
            else{
                if (item < arr[mIndex]){
                    hIndex = mIndex-1;
                }
                else
                    break;
            }

        }
        if (arr[lIndex] > arr[hIndex]){
            System.out.println(item+ " was not found");
        }
        else
            System.out.println(item+ "   found");


    }

    public void binarySort(int[] arr){
        int i, j;
        for (j = 0; j <= arr.length-2; j++){
            for (i =0; i <= arr.length - 2 - j; i++){
                if (arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }

        }
      for(i=0; i <= arr.length-1; i++)
          System.out.print(arr[i]);
    }
    public void arrange(int [][] arr){
        if(arr == null){
            System.out.println("Array cannot be empty, pls populate array and try again");
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }  }

    public int[][] multiply(int [][]arr, int[][] arr2  ){
        if(arr[0].length != arr2.length){
           System.err.println("the two matrices cant be multiplied");
            return null;
        }
        int[][] result = new int[arr.length][];
        for(int i = 0; i < result.length; i++){
            result[i] = new int[arr[0].length];
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr[0].length; k++) {
                    result[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }
        return result;
    }


}
