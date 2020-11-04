package com.java.core;

//Before
@SuppressWarnings("unused")
final class Point {
    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // state-based implementations of equals, hashCode, toString
    // nothing else
}

/**
 * We need to write a lot of low-value, repetitive code to write a simple data carrier class
 * responsibly: constructors, accessors, equals(), hashCode(), toString(), etc.
 * To avoid this repetitive code, Java is planned to use record.
 *
 * It is used to compact the class declaration syntax with record.
 *
 * Limitation of using records:
 *
 *   Records cannot extend any other class, and cannot declare instance fields
 *   other than the private final fields which correspond to components of the
 *   state description.
 *   Records are implicitly final, and cannot be abstract, such limitations
 *   underline that a record's API is entirely defined by its state definition
 *   and can not be modified by another class or record later.
 *   The components of a record are implicitly final.
 */
record JavaRecord(int x, int y) { }


