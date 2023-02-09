package org.mine.JanTestZSGS;
/* 
 *
 */
public class CoutningSort {
    private String sortTheList(String[][] word){
        StringBuilder value = new StringBuilder();
        int freq=0;
        int index=0;
        while(freq<10 && index<word.length){
            int current=Integer.parseInt(word[index++][0]);
            if(index==word.length-1)
                return value.toString();
            if(current!=freq)
                continue;
            for(int inner=freq;inner<word.length;inner++){
                if(current==Integer.parseInt(word[inner][0])){
                    if(inner<word.length/2){
                        value.append('-');
                    }else{
                        value.append(word[inner][1]+" ");
                    }
                }
                
            }
            index=0;
            freq++;
        }

        
        return value.toString();
    }


    
    public static void main(String[] args) {
       String[][] words ={{"0","ab"},
                    {"6","cd"},
                    {"0","ef"},
                    {"6","gh"},
                    {"4","ij"},
                    {"0","ab"},
                    {"6","cd"},
                    {"0","ef"},
                    {"6","gh"},
                    {"0","ij"},
                    {"4","that"},
                    {"3","be"},
                    {"0","to"},
                    {"1","be"},
                    {"5","question"},
                    {"1","or"},
                    {"2","not"},
                    {"4","is"},
                    {"2","to"},
                    {"4","the"}
                };

        CoutningSort coutningSort = new CoutningSort();
        System.out.println(coutningSort.sortTheList(words));
    }
}
