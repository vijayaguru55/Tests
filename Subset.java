package org.mine.JanTestZSGS;

import java.util.ArrayList;
/*Q.No.7 */
public class Subset {
    private ArrayList<ArrayList<Integer>> subSet(int[] elements,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> listOfList,boolean[] visited) {
        if(list.size()==elements.length)
            return listOfList;

        for(int index=0;index<elements.length;index++){
            if(visited[index] )
                continue;
            list.add(elements[index]);
            if(!listOfList.contains(list))
                listOfList.add(list);
            visited[index]=true;
            
            subSet(elements, new ArrayList<Integer>(), listOfList, visited);
            visited[index]=false;
            
        }
        if(!listOfList.contains(list))
                listOfList.add(list);
        return listOfList;
    }
    public static void main(String[] args) {
        int[] elelments ={1,2,3,4,5};
        Subset subset = new Subset();
        ArrayList<ArrayList<Integer>> result = subset.subSet(elelments, new ArrayList<Integer>(), new ArrayList<ArrayList<Integer>>(), new boolean[elelments.length]);
        //Printing//
        for (ArrayList<Integer> list : result ) {
            System.out.println(list);
        }

        System.out.println("Size =:"+ result.size() );
    }
}
