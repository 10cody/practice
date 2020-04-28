package com.cody.practice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.TestComponent;

/**
 * @ Author  cody
 * @ Date    2020/4/28
 * @ Version  v1.1
 */
@TestComponent
public class Interview {

    @Test
    public boolean isUnique(String astr) {
        astr = "test";
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
}
