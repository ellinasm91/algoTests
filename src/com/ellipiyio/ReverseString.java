package com.ellipiyio;

/**
 * Created by mikeellinas on 7/13/17.
 */
public class ReverseString {

    public static void main(String[] args) {
        System.out.println("came here");
        ReverseString h2 = new ReverseString();
        h2.init();
        return;
    }

    void init() {


        System.out.println(" "+reverse( "HelloMike"));

    }

    String reverse(String input){
        if (input==null) return null;
        StringBuilder mySB= new StringBuilder();
        for (int i=input.length()-1; i>=0; i-- ){
            mySB.append(input.charAt(i));
        }
        return mySB.toString();
    }
}
