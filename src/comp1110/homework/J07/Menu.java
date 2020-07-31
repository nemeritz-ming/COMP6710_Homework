package comp1110.homework.J07;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public static int findRange(int[] array){
        Arrays.sort(array);
        return array[array.length-1]-array[0];
    }
    public static int getMax(int[] array){
        Arrays.sort(array);
        return  array[array.length-1];
    }
    public static int getSecondHighest(int[] array){
        Arrays.sort(array);
        for (int i = array.length-2; i >= 0;--i){
            if (array[i] < array[array.length-1]) {
                return array[i];
            }
        }
        return array[array.length-1];
    }

    public static void main(String[] args) {
        System.out.println("Please enter:\n" +
                "1 to find range of the scores\n" +
                "2 to find the maximum score\n" +
                "3 to find the second highest score");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1){
            int num = in.nextInt();
            int[] array = new int[num];
            for (int i = 0; i < num; ++i){
                int ele = in.nextInt();
                array[i] = ele;
            }
            System.out.println(findRange(array));
        }
        else if(a == 2){
            int num = in.nextInt();
            int[] array = new int[num];
            for (int i = 0; i < num; ++i){
                int ele = in.nextInt();
                array[i] = ele;
            }
            System.out.println(getMax(array));
        }
        else if(a == 3){
            int num = in.nextInt();
            int[] array = new int[num];
            for (int i = 0; i < num; ++i){
                int ele = in.nextInt();
                array[i] = ele;
            }
            System.out.println(getSecondHighest(array));
        }
        else{
            System.out.println("Invalid Option Selected");
        }
    }
}
