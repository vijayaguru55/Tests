package org.mine.JanTestZSGS;

import java.util.Arrays;
/*Q.no.8 */
public class InsertionSort {
    public void inesetionSort(int[] unsorted){
        int length = unsorted.length;
        for(int index=1;index<length;index++){
            for(int traversal=index;traversal>0;traversal--){
                if((unsorted[traversal]<unsorted[traversal-1])){
                    int temp = unsorted[traversal];
                    unsorted[traversal]=unsorted[traversal-1];
                    unsorted[traversal-1]=temp;
                }
                else
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] elements= {12,3,45,2,1,5,6,7};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.inesetionSort(elements);
        System.out.println(Arrays.toString(elements));
    }
}
