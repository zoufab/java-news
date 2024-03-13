package com.zou;

import com.zou.record_patterns.PatternMatchingRecords;
import com.zou.record_patterns.domain.Shape;
import com.zou.string_template.FormatterTemplateUtils;
import com.zou.string_template.RawTamplateUtils;
import com.zou.string_template.StringTemplateUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        // String Template
        StringTemplateUtils st = new StringTemplateUtils();
        st.stringTemplateProcessor();
        st.arthmeticTemplateProcessor();
        st.expressiionTemplateProcessor();
        st.multiLineExpression();

        FormatterTemplateUtils ft = new FormatterTemplateUtils();
        ft.ftmProcessor();

        RawTamplateUtils rt = new RawTamplateUtils();
        rt.rawTemaplateProcessor();


        // Records soon ...
        PatternMatchingRecords pmr = new PatternMatchingRecords();
        pmr.patterMatchingWithRecords(new Shape(10.3));
    }
}
