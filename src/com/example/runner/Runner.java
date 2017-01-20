package com.example.runner;

import com.example.constructors.ConstructorExampleObject;
import com.example.fields.FieldExampleObject;
import com.example.methods.MethodExampleObject;
import com.example.thisExample.ThisExampleObject;

import com.example.ExampleObject;

public class Runner {
    public static void main(String[] args) {
        ExampleObject exampleObject = new ExampleObject();

        //fields
        FieldExampleObject fieldExampleObject = new FieldExampleObject();

        fieldExampleObject.age = 10;
        fieldExampleObject.comment = "some comment";
        fieldExampleObject.name = "A Name";

        System.out.println(fieldExampleObject.age);
        System.out.println(fieldExampleObject.comment);
        System.out.println(fieldExampleObject.name);

        //methods
        MethodExampleObject methodExampleObject = new MethodExampleObject();
        System.out.println(methodExampleObject.giveMeAStringPlease("Some string"));
        System.out.println(methodExampleObject.dontGiveMeAStringPlease());

        System.out.println(methodExampleObject.overloaded("hi"));
        System.out.println(methodExampleObject.overloaded("hi", "there"));

        //"this"
        ThisExampleObject thisExampleObject = new ThisExampleObject();

        thisExampleObject.getThis().getThis().getThis().getThis().getThis().getThis();

        //constructors
        ConstructorExampleObject constructed = new ConstructorExampleObject();
        printFields(constructed);

        printFields(new ConstructorExampleObject("value1"));
        printFields(new ConstructorExampleObject("value1", 12));
        printFields(new ConstructorExampleObject("value1", 12, "value2"));

        //visibility

        //instance vs class

        //inheritance
    }

    private static void printFields(ConstructorExampleObject argument) {
        System.out.println("value1 -> " + argument.mixTheValues());
    }
}
