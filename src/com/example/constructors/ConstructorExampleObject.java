package com.example.constructors;

public class ConstructorExampleObject {

    private String value1;
    private Integer integer;
    private String value2;

    public ConstructorExampleObject() {
        this("default value1", 1, "default value2");
    }

    public ConstructorExampleObject(String value1) {
        this();
        this.value1 = value1;
    }

    public ConstructorExampleObject(Integer integer) {
        this.value1 = "default value1";
        this.value2 = "default value2";
        this.integer = integer;
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

    public String mixTheValues() {
        return value1 + value2 + integer;
    }

}
