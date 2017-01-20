package com.example.runner;

import com.example.fields.FieldExampleObject;
import com.example.methods.MethodExampleObject;

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

        //constructors

        //instance vs class

        //visibility

        //inheritance
    }
}
