package com.zou;

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

        StringTemplateUtils st = new StringTemplateUtils();
        st.stringTemplateProcessor();
        st.arthmeticTemplateProcessor();
        st.expressiionTemplateProcessor();
        st.multiLineExpression();

        FormatterTemplateUtils ft = new FormatterTemplateUtils();
        ft.ftmProcessor();

        RawTamplateUtils rt = new RawTamplateUtils();
        rt.rawTemaplateProcessor();
    }
}
