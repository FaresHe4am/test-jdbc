package org.example;

public class singetonTest {
    private static singetonTest singleton;

    private singetonTest(){

    }

    public static singetonTest getInstance(){
        return singleton;
    }
}
