package org.mine.JanTestZSGS;

import java.util.ArrayList;
import java.util.Arrays;
/*Q.no.1 */

public class FlavorsByCash {
    private static  ArrayList<ArrayList<Integer>> getDividedFlavours(int[] flavours , int money,int start,ArrayList<ArrayList<Integer>> listOfList){
        if(start==flavours.length-1)
            return listOfList;
        for(int index=start;index<flavours.length;index++){

            if((flavours[start]+flavours[index])%money==0){
                ArrayList<Integer> values = new ArrayList<>();
                values.add(0,start+1);
                values.add(1,index+1);

                if(listOfList.isEmpty()){
                    listOfList.add(values);
                }else if(listOfList.get(listOfList.size()-1).size()>values.size()){

                    listOfList.remove(listOfList.get(listOfList.size()-1));
                    listOfList.add(values);
                }
            }
        }
       return getDividedFlavours(flavours, money, start+1, listOfList);
    }


    private int[] getIceCream(int[] flavours,int money){

        ArrayList<ArrayList<Integer>> result = getDividedFlavours(flavours, money, 0, new ArrayList<ArrayList<Integer>>());
        ArrayList<Integer> list = result.get(result.size()-1);
        int[] res = new int[2];
        int index=0;
        for (Integer value : list) {
            res[index++]=value;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] flavours ={1,3,4,5,6};
        FlavorsByCash flavorsByCash = new FlavorsByCash();
        System.out.println(Arrays.toString(flavorsByCash.getIceCream(flavours, 6)));
    }
}
