package com.company;

import com.company.Abstraction.Puppy;
import com.company.Classes.Class1;
import com.company.Classes.Class2;
import com.company.Inheritance.Mouse1;
import com.company.Inheritance.Mouse2;
import com.company.Polymorphism.Bird;
import com.company.Polymorphism.Robin;

public class Main {

    public static void inheritanceDemo(){
        Mouse1 m1 = new Mouse1();
        m1.connect();
        m1.scrollUp();
        m1.rightClick();

        Mouse2 m2 = new Mouse2();
        m2.rightClick();
        m2.leftClick();
        m2.changeColor("Red");
    }

    public static void polymorphismDemo(){
        Bird bird = new Bird();
        bird.sing();
        Robin robin = new Robin();
        robin.sing();
    }

    public static void classDemo(){
        Class1 c = new Class1();
        System.out.println(c.x);
        c.sayHi();

        Class2 c2 = new Class2();
        System.out.println(c2.y);
        System.out.println(c2.isValid("Valid"));
    }

    public static void abstractionDemo(){
        Puppy pup = new Puppy();
        pup.bark();
        pup.poop();
    }

    public static void main(String[] args) {

        inheritanceDemo();
        polymorphismDemo();
        classDemo();
        abstractionDemo();

    }
}
