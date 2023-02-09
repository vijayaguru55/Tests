package org.mine.JanTestZSGS;
import java.util.ArrayList;
/*Q.No.1 */
public class ElementsDivisibleByK {
    private ArrayList<ArrayList<Integer>> getDivisibleElemnts(int[] elements , int divisor,int start,ArrayList<ArrayList<Integer>> listOfList){
        if(start==elements.length-1)
            return listOfList;
        for(int index=start;index<elements.length;index++){
            if(start<index && (elements[start]+elements[index])%divisor==0){
                ArrayList<Integer> values = new ArrayList<>();
                values.add(0,elements[start]);
                values.add(1,elements[index]);
                listOfList.add(values);
            }
        }
       return getDivisibleElemnts(elements, divisor, start+1, listOfList);
    }
    public static void main(String[] args) {
        int[] elements = {1,2,3,4,5,6};
        int divisor = 6;
        ElementsDivisibleByK elementsDivisibleByK = new ElementsDivisibleByK();
        for (ArrayList<Integer> list : elementsDivisibleByK.getDivisibleElemnts(elements, divisor, 0, new ArrayList<ArrayList<Integer>>())) {
            System.out.println(list);
        }
    }
}
