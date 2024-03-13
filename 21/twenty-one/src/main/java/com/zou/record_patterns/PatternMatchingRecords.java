package com.zou.record_patterns;

import com.zou.record_patterns.domain.*;

/**
 * <p>
 *  A record pattern consists of a record class type and a (possibly empty)
 *  pattern list which is used to match against the corresponding record component values.
 *     <ul>
 *         <li>The null value does not match any record pattern</li>
 *         <li>A record pattern can use var to match against a record component</li>
 *         <li>An expression is compatible with a record pattern if it could be cast to the record type in the pattern without requiring an unchecked conversion.</li>
 *     </ul>
 *
 * </p>
 */
public class PatternMatchingRecords {

    public void patterMatchingWithRecords(Object obj) {

        // from java 16
        if (obj instanceof Shape s){
            double area = s.area();
            System.out.println(STR."pattern matching from java 16 \{area}");
        }

        // java 21
        // We can directly match area from record Shape
        if (obj instanceof Shape(double area)){
            System.out.println(STR."pattern matching from java 21 \{area}");
        }
    }

    /**
     * Record support nesting
     */
    public void nestedRecordPattern(Triangle tr){
        // ColoredPoint is a record : we can match it directly
        if( tr instanceof Triangle(ColoredPoint c1, ColoredPoint c2, ColoredPoint c3)){
            System.out.println(STR."nested pattern matching from java 21 \{c1.color()}");
        }

        // But Point also a record: we can match it from ColoredPoint
        if( tr instanceof Triangle(ColoredPoint c1, ColoredPoint c2, ColoredPoint(Point(int x, int y), Color color))){
            System.out.println(STR."nested pattern matching from java 21 Third point \{x}, \{y}");
            System.out.println(STR."nested pattern matching from java 21 Third point color \{color}");
        }

    }


}
