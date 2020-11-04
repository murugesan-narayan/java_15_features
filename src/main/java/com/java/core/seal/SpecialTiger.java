package com.java.core.seal;

public sealed class SpecialTiger extends SealedAnimal permits SiberianTiger {
    @Override
    public void info() {
        System.out.println("I am a special breed of Tiger");
    }
}
