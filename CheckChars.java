package org.Test1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckChars {
    static String checkChars(String s1, String s2){
        String val="";
        Set<Character> set =  new HashSet<>();
        for(int i=0;i<s2.length();i++)
            set.add(s2.charAt(i));

        int[] ch = new int[26];
        Arrays.fill(ch, 0);

        
        
        for(int j=0;j<s1.length();j++){
            char origin = s1.charAt(j);
            if(set.contains(origin))ch[origin-97]+=1;
    
        }
        for(int i=0;i<s2.length();i++)
            val+=s2.charAt(i)+":"+ch[s2.charAt(i)-97]+" ";

        return val;
    }
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter word");
        String original= input.nextLine();
        System.err.println("Enter reference ");
        String reference = input.next();
        input.close();
        System.out.println(checkChars(original.toLowerCase(), reference.toLowerCase()));
    }
}
