package com.brutex.gitflow;

import java.util.Optional;

public class GreetingGenerator
{
    public static String build(String name){
        return "Hello, " + Optional.ofNullable(name).orElse("unknown") + "!";
    }
}
