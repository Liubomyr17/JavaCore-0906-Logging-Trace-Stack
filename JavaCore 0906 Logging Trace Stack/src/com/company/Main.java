package com.company;

/*

0906 Logging Trace Stack
Implement the log method.
It should display the class name and the method name (in which the log method is called), as well as the message passed.
Separate the class name, method name, and message with a space.
Output Example:
com.javarush.task.task09.task0906.Solution: main: In main method

Requirements:
1. The log method should display a message.
2. The output message should contain the name of the class whose method called the log method.
3. The output message should contain the name of the method that called the log method.
4. The displayed message should contain the transmitted message.
5. The conclusion should correspond to the example from the assignment.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        String cls = elements[2].getClassName();
        String fn = elements[2].getMethodName();
        System.out.printf("%s: %s: %s\n", cls, fn, s);
    }
}


