package com.example.constructors;

public class ConstructorExampleObject {

    private final String value1;
    private final Integer integer;
    private final String value2;

    public ConstructorExampleObject() {
        this.value1 = "default value1";
        this.value2 = "default value2";
        this.integer = 1;
    }

    public ConstructorExampleObject(String value1) {
        this.value1 = value1;
        this.value2 = "default value2";
        this.integer = 1;
    }

    public ConstructorExampleObject(String value1, Integer integer) {
        this.value1 = value1;
        this.value2 = "default value2";
        this.integer = integer;
    }

    public ConstructorExampleObject(String value1, Integer integer, String value2) {
        this.value1 = value1;
        this.value2 = value2;
        this.integer = integer;
    }

    public String getValue1() {
        return value1;
    }

    public Integer getInteger() {
        return integer;
    }

    public String getValue2() {
        return value2;
    }
}
