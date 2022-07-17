package com.projects;

public class DefaultConstructor {
    //the default constructor is provided by the compiler only if the class
    //does not define ANY constructors
    // it also calls the super class with no-args constructor

    public DefaultConstructor() { // this constructor is automatically provided by the compiler
        super(); // it calls the super class default with no-args constructor
    }

    // if you define another constructor, the compiler will not generate any other constructors


}
