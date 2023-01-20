package org.Test1;

import java.util.Scanner;
import java.util.Stack;

public class ValidExpression {

    static boolean isValid(String expression){
        
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<expression.length();i++){
            char n =expression.charAt(i);
            boolean isExp=n=='+'?true:n=='-'?true:n=='*'?true:n=='/'?true:false;
            // boolean isChar = (n>=97 && n<=122);
        
            if(n=='('){
                stack.push(n);
                continue;
            }
            if(n==')' && stack.isEmpty()){
                return false;
            }else if(n==')' && !stack.isEmpty()){
                stack.pop();
                continue;
            }
            if(isExp){
                if(isChar(expression.charAt(i-1)) && isChar(expression.charAt(i+1)))
                    continue;
                return false;
            }
            else if(isChar(n) && stack.isEmpty())
                return false;
    
    }
        if(!stack.isEmpty())
            return false;
        return true; 
    }


    static boolean isChar(char n){
        if(n>=97 && n<=122)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter Expression");
        String expression = input.nextLine();
        input.close();
        if(isValid(expression))
            System.out.println("Valid");
        else
            System.out.println("invalid");
    }
}
