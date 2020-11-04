package com.java.core.seal;

/**
 * Sealed classes and interfaces restrict/limit, which other classes or interfaces may extend or implement them.
 * A class can be sealed by using the sealed modifier.
 * The permits clause specifies the classes that are permitted/allowed to extend the sealed class.
 * Inherited sub class must explicitly declare how it propagates the seal
 * with one of the final, sealed or non-sealed modifier.
 * This feature is still in preview.
 */
public sealed class SealedAnimal permits NamedTiger, SpecialTiger {
    public void info() {
        System.out.println("From Sealed Animal");
    }
}
