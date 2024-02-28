package com.zou.string_template;

import static java.lang.StringTemplate.RAW;

public class RawTamplateUtils {

    public void rawTemaplateProcessor(){
        // When STR is a shortcut of :

        String name = "Joan";
        StringTemplate st = RAW."My name is \{name}";
        String info = STR.process(st);

        System.out.println(info);
    }
}
