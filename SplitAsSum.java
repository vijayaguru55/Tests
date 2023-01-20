package org.Test1;

import java.util.Arrays;

public class SplitAsSum {
    static int[][] split(int[] n){
        int[][] sums=new int[2][];
        int i=0,j=n.length-1;
        int sum1=0,sum2=0;
        while(i<=j){
           
            if(sum1<sum2){
            sum1+=n[i];
                i++;
            }
            else if(sum1>sum2){
                sum2+=n[j];
                j--;
            }else{
                sum1+=n[i];
                sum2+=n[j];
                i++;
                j--;
            }
        }
      
        int[]a = Arrays.copyOfRange(n,0, i);
        int[] b= Arrays.copyOfRange(n,j+1, n.length);
        sums[0]=a;
        sums[1]=b;
        return sums;
    }
    public static void main(String[] args) {
        int[] n = {1,2,1,2,1,1};
        // split(n);
        int[][] m=split(n);
        System.out.println(Arrays.toString(m[0]));
        System.out.println(Arrays.toString(m[1]));
    }
}
