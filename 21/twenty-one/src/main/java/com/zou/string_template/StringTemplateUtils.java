package com.zou.string_template;

import static java.lang.StringTemplate.STR;

/**
 * @see FTM processor : can interprets formatter
 * @see RAW processor : standard tamplate processor
 */
public class StringTemplateUtils {

    public void stringTemplateProcessor() {
        String firstName = "Bill";
        String lastName  = "Duck";
        String fullName  = STR."\{firstName} \{lastName}";

        System.out.println(fullName);

        String sortName  = STR."\{firstName}, \{lastName}";

        System.out.println(sortName);
    }

    public void arthmeticTemplateProcessor() {
        int x = 10, y = 20;
        String s = STR."\{x} + \{y} = \{x + y}";

        System.out.println(s);
    }

    public void expressiionTemplateProcessor() {
        String s = STR."My age is \{getAge()}";
        System.out.println(s);
    }

    public void multiLineExpression() {
        String name    = "Joan Smith";
        String phone   = "555-123-4567";
        String address = "1 Maple Drive, Anytown";
        String json = STR."""
    {
        "name":    "\{name}",
        "phone":   "\{phone}",
        "address": "\{address}"
    }
    """;
        System.out.println(json);
    }
    private int getAge(){
        return 33;
    }
}
