package com.company;

public class Main {

    public static void main(String[] args) {
        int array[] = new int[]{4, 6, 1, 8, 3, 7, 9, 0, 10};

//            int max = getMax(array);
//            System.out.println("Maximum Value is: "+max);
//
//            int min = getMin(array);
//            System.out.println("Minimum Value is: "+min);

       /* int maxValue = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
            System.out.println(maxValue);
        }
        int minValue = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < minValue) {
                minValue = array[i];
            }
            System.out.println(minValue);
        }


    }*/
        int maxValue = array[0];
        for(int i=1;i < array.length;i++){
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }
        System.out.println(maxValue);

        int minValue = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        System.out.println(minValue);
    }



}

