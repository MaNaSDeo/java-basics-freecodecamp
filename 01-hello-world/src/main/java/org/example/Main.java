package org.example;

public class Main {

    // public - visible to everyone,
    // class - Defines a blueprint,
    // Main - name of the class, file name must match this when public,
    // this "Main" i.e. top level class's name should match the name of source file,
    // i.e. if the source file name is "Main", then top level class name should be "Main"
    // if source file name is "Manas" then, top level class name should be "Manas".
    public static void main(String[] args) {
        // static - doesn't need to create an object to call this method,
        // void - this function will not return anything.
        // main - specail method: it's the entry point for every java application
        // String[] args - allows command line argument
        System.out.println("Hello World!");
        // System - built-in class that provides access to system-level stuff.
        // out - standard output stream
        // println - prints with new line
    }
}