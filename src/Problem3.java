/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author Petrove
 */
public class Problem3 {
    public static void main (String[] args) {
       String[] texts = {"I love cake", "This is no error"};
       for(String text : texts) {
           System.out.println("Original text: " + text);
           printWordsInReverse(text);
           System.out.println();
       }
    }
    
    public static void printWordsInReverse (String sentence) {
        
        /*Stack<Character> charStack = new Stack<>();// empty stack of characters
        // Write your code here\
        String [] words = sentence.split("");
        char a = words[1].charAt(1);
        
        
        //push  all characters of a string into the stack
        char [] c = sentence.toCharArray();
        for(int i=0;i<sentence.length();i++){
            charStack.push(c[i]);
        }
        
        int k=0;
        while(!charStack.isEmpty()){
            c[k++]= charStack.pop();
        }
        String reverse = String.copyValueOf(c);
        System.out.print(reverse);*/
        
        
        Stack<Character> charStack = new Stack<>();// empty stack of characters
        // Write your code here\
        
        
       //split sentence into individual words
        int k=1;
        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            if(ch==' ')
              k++;// counts the number of words in the sentence to determine the size of words[] array
        }
        
        char [] c = new char[sentence.length()];
        String [] words = sentence.split(" ",k);
        int count=0;
         String reverse="";
         //to put spaces between the words
         for(int i=0;i<words.length;i++)
        {
            if(i>0&&i<words.length)
            {
                words[i]+=" ";//appends space to the word
            }
        }
         
         //loop to push each word's characters in to the stack
        for(String ss: words){
           
            for(int j=0;j<ss.length();j++)
            {
                 charStack.push(ss.charAt(j));
            }
            
            while(!charStack.isEmpty()){
                 c[count++]= charStack.pop();
              }
             
        }
        reverse += String.copyValueOf(c)+' ';
        System.out.print(reverse);
       
    }
        
}