package org.Test1;
import java.util.HashSet;
import java.util.Set;

public class EvaluateStrings {
    static int evaluate(String[] s1, String[] s2){
        int count=0;
        for(int i=0;i<s1.length;i++){
            String s = s1[i];
            if(check(s, s2)){
                count++;
            }
        }
        return count;
    }

    static boolean check(String s1, String[] s){
        Set<Character> set= new HashSet<>();
        for(int i=0;i<s1.length();i++)
            set.add(s1.charAt(i));

        for(int i=0;i<s.length;i++){
            for(int j=0;j<s[i].length();j++){
                if(set.contains(s[i].charAt(j))){
                    continue;
                }else{
                    return false;
                }

            }
        }
        return true;
    }
    public static void main(String[] args) {
        String[] x ={"ceo","alceo","caaeio","caei"};
        String[] y = {"ce","oc","ceo"};
        System.out.println(evaluate(x, y));
    }
}
