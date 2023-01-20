package org.Test1;

import java.util.Arrays;
import java.util.Scanner;

public class DenominationsOfCoins {

    static int[] getCoins(int need){
        int[] l = new int[4];
        Arrays.fill(l,0);
        int[] coins ={5,5,5,5};
        int current = 90;
        if(need>current){
            Arrays.fill(l, -1);
            return l;
        }
        int tens =need/10;
        int fives = need/5;
        int twos = need/2;
        int ones=need/1;
        while(need>0){
            if(tens>1){
                need-=10;
                coins[3]--;
                l[0]++;
                tens--;
                if(need<0){
                    coins[3]++;
                    l[0]--;
                    need+=10;
                }
            }
             if(fives>1){
                need-=5;
                coins[2]--;;
                l[1]++;
                fives--;
                if(need<0){
                    coins[2]++;
                    l[1]--;
                    need+=5;
                }
            }
            if(twos>1){
                need-=2;
                coins[1]--;
                l[2]++;
                twos--;
                if(need<0){
                    
                    coins[1]++;
                    l[2]--;
                    need+=2;
                }
            }
            if(ones>1){
                ones--;
                need-=1;
                coins[0]--;
                l[3]++;
                if(need<0){
                    coins[0]++;
                    l[3]--;
                    need+=1;
                }
            }
            
        }
        current=coins[0]+(coins[1]*2)+(coins[2]*5)+(coins[3]*10);
        return l;

    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Amount");
        int need = input.nextInt();
        input.close();
        System.out.println("10s 5s 2s 1s  Toatal");
        for (int i : getCoins(need)) {
            System.out.print(i+"  ");
        }
        System.out.print(" "+need);
    }

}
