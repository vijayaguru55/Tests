package org.mine.JanTestZSGS;

import java.util.Arrays;
/*Q.No:3 */

public class NotificationCount {
    private int getNotificationCount(int[] tarnsections,int tarilingDays){
        quickSort(tarnsections, 0, tarnsections.length-1, true);
        int notificationCount=0;
        int[] trailingDaysTransectiond = Arrays.copyOfRange(tarnsections, 0, tarilingDays);
        int traiLength = trailingDaysTransectiond.length;
        int median = traiLength%2!=0?trailingDaysTransectiond[traiLength/2]:
                                     (trailingDaysTransectiond[traiLength/2]+
                                     trailingDaysTransectiond[traiLength/2-1])/2;
       for(int index=tarilingDays;index<tarnsections.length;index++)
            if(tarnsections[index]>(median*2))
                notificationCount++;
        
        return notificationCount;
    }


    
    public static void main(String[] args) {
        int[] transections ={1,2,3,4,4};
        int trailingDays=4;
        NotificationCount notificationCount = new NotificationCount();
        int notifications = notificationCount.getNotificationCount(transections, trailingDays);
        System.out.println(notifications);

    }


    public static void quickSort(int[] elements,int left, int right,boolean as){
        if(left>=right){
            return;
        }
        int start=left;
        int end= right;
        int mid = (start+end)/2;
        int pivot = elements[mid];
        while(start<=end){        
            while(as?(elements[start]<pivot):(elements[start]>pivot)){
                start++;
            }
            while(as?(elements[end]>pivot):(elements[end]<pivot)){
                end--;
            }
            if(start<=end){
                int t=elements[start];

                elements[start]=elements[end];

                elements[end]=t;

                start++;

                end--;
            }
        }

        quickSort(elements, left, end, as); 

        quickSort(elements, start, right, as);
        

    }
}
