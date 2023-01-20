package org.Test1;

import java.util.Arrays;
import java.util.Scanner;

public class CheckChars {
    static String checkChars(String s1, String s2){
        String val="";
        
        int[] ch = new int[26];
        Arrays.fill(ch, 0);

        if(s2.length()>s1.length())
            return null;
        

        for(int i=0;i<s2.length();i++){
            for(int j=0;j<s1.length();j++){
            char ref = s1.charAt(j);
            if(s2.charAt(i)==ref){
                ch[s2.charAt(i)-97]+=1;
            }
        }
                
        
        }
        for(int i=0;i<s2.length();i++)
            val+=s2.charAt(i)+":"+ch[s2.charAt(i)-97];

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
