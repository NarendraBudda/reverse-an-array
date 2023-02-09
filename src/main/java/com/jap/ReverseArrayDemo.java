package com.jap;

public class ReverseArrayDemo {

    public static void main(String[] args) {


        int array[]={23,34,43,56,67,78,43,35};
        ReverseArrayDemo reverseArrayDemo=new ReverseArrayDemo();
        int reverseArray[]=reverseArrayDemo.getReverseArray(array);
        for(int i=0;i<reverseArray.length;i++){
            System.out.println(reverseArray[i]);
        }

    }

    //Write the logic to reverse the given array inside the below
    // method and return the reverse array.
    public int[] getReverseArray(int [] array){
        int n = array.length;
        int reversearray[]=new int[n];
        for(int i=0;i<n;i++){

                reversearray[n-1-i]=array[i];

        }
        return reversearray;
    }



    }

