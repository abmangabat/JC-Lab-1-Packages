package org.example.main;


// Import here manually
import org.example.packageone.ClassOne;
import org.example.packagetwo.ClassTwo;
import org.example.packagethree.ClassThree;

public class Main {
    public static void main(String[] args) {
        ClassOne one = new ClassOne();
        ClassTwo two = new ClassTwo();
        ClassThree three = new ClassThree();

        System.out.println(one.greet());
        System.out.println(two.greet());
        System.out.println(three.greet());

    }
}