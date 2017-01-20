package com.example.methods;

public class MethodExampleObject {
    public String giveMeAStringPlease(String fancyArgument) {
        return "This is a string: " + fancyArgument;
    }

    public String dontGiveMeAStringPlease() {
        return "This is a string";
    }

    public String overloaded(String value) {
        return value + " default value";
    }

    public String overloaded(String value, String anotherValue) {
        return value + anotherValue;
    }
}
