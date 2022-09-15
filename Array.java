package javaapplication1;

import java.util.*;

public class Array {

    public static void main(String[] args) {
        int n,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("input array size :");
        n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            //System.out.print(array[i] + " ");
            sum+=array[i];    
        }
        System.out.println("av ="+sum/n);
        int av=sum/n;
        for(int i=0;i<n;i++){
            if(av<array[i]){
                System.out.print("avarage :"+array[i]+" ");
            }
        }
        System.out.println();
        
    }

}
