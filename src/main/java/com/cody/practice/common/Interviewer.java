package com.cody.practice.common;

/**
 * @ Author  cody
 * @ Date    2020/4/28
 * @ Version  v1.1
 */
public class Interviewer {

    public static boolean isUnique(String astr) {
        if(astr.length() > 256)
            return false;

        boolean[] charArray = new boolean[256];
        for (int i = 0; i < astr.length(); i++)
        {
            int val = astr.charAt(i);
            if (charArray[val])
            { return false; }
            charArray[val] = true;
        }
        return true;
    }

    public static void main(String[] args){
        isUnique("test");
    }

}
