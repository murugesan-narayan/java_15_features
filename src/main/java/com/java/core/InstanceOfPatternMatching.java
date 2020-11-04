package com.java.core;

/**
 * Instance of is used to check whether the object reference is and instance of given Type
 * or not, and return boolean flag.
 */
@SuppressWarnings("all")
public class InstanceOfPatternMatching {
    public static void main(String[] args) {
        Object str = "5";
        Object val = 5;
        Number n = 5;

        //Before
        if (str instanceof String) {
            String conv = (String) str; // we need both instance check as well as
                                        // casting with declaration
            System.out.println("conv = " + conv);
        }
        //Now
        if (str instanceof String l) //no need explicit cast, automatically assigns it.
            System.out.println("l = " + l);
        if (val instanceof Integer l) //no need explicit cast, automatically assigns it.
            System.out.println("l = " + l);
        if (n instanceof Number l)
            System.out.println("l = " + l);
        str = null;
        if (str instanceof String l) //no casting mismatch error, simply returns false.
            System.out.println("l = " + l);
        else System.out.println("L not assigned");
    }
}
