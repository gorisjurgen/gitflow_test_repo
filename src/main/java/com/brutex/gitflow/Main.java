package com.brutex.gitflow;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(greet("World"));
    }

    public static String greet(String name)
    {
        System.out.println("Start Greeting");
        return GreetingGenerator.build(name);
    }
}
