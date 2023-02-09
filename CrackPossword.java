package org.mine.JanTestZSGS;
import java.util.HashSet;
import java.util.Set;
/*Q.No.4 */

public class CrackPossword {
    private String isValdPassword(String passwords,String createdPassword){
       StringBuilder result = new StringBuilder();
       Set<String> words =  new HashSet<>();
        int start=0;
       for(int index=0;index<passwords.length();index++){
            if(passwords.charAt(index)==' '){
                String word = passwords.substring(start, index);
                start=index+1;
                words.add(word);
            }
       }
       words.add(passwords.substring(start));
       
       String current="";
       for(int traversal=0;traversal<createdPassword.length();traversal++){
            current+=createdPassword.charAt(traversal);
            if(words.contains(current)){
                result.append(current);
                result.append(" ");
                current="";
            }
       }
       if(result.length()<createdPassword.length())return"WRONG PASSWORD";
       return result.toString();
    }

    public static void main(String[] args) {
        String words = "ab abcd cd";
        String cracked ="abcd";
        CrackPossword crackPossword = new CrackPossword();
        System.out.println(crackPossword.isValdPassword(words, cracked));
    }
}
