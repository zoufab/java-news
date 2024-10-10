package com.zou;

import com.zou.record_patterns.PatternMatchingRecords;
import com.zou.record_patterns.domain.Color;
import com.zou.record_patterns.domain.ColoredPoint;
import com.zou.record_patterns.domain.Point;
import com.zou.record_patterns.domain.Shape;
import com.zou.record_patterns.domain.Triangle;
import com.zou.sequenced_collection.model.ConcretSequencedCollection;
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
        pmr.nestedRecordPattern(new Triangle(
                new ColoredPoint(new Point(1,2), Color.BLUE),
                new ColoredPoint(new Point(2,3), Color.GREEN),
                new ColoredPoint(new Point(3,4), Color.RED)));

        // Sequenced Collection soon ...
        ConcretSequencedCollection csc = new ConcretSequencedCollection();
        csc.exploringSequencedCollection();
        csc.exploringSequencedMap();
    }
}
