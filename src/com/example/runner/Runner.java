package com.example.runner;

import com.example.constructors.ConstructorExampleObject;
import com.example.fields.FieldExampleObject;
import com.example.methods.MethodExampleObject;
import com.example.thisExample.ThisExampleObject;

public class Runner {
    public static void main(String[] args) {
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
        methodExampleObject.giveMeAStringPlease();

        //"this"
        ThisExampleObject thisExampleObject = new ThisExampleObject();
        thisExampleObject.getThis().getThis().getThis().getThis().getThis();

        //constructors
        printFields(new ConstructorExampleObject("value1"));
        printFields(new ConstructorExampleObject("value1", 12));
        printFields(new ConstructorExampleObject("value1", 12, "value2"));

        //instance vs class

        //visibility

        //inheritance
    }

    private static void printFields(ConstructorExampleObject constructorExampleObject) {
        System.out.println("value1 -> " + constructorExampleObject.getValue1());
        System.out.println("value2 -> " + constructorExampleObject.getValue2());
        System.out.println("integer -> " + constructorExampleObject.getInteger());
    }
}
