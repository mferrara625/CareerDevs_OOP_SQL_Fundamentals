package com.company;

import com.company.Abstraction.Puppy;
import com.company.Classes.Class1;
import com.company.Classes.Class2;
import com.company.Encapsulation.Student;
import com.company.Inheritance.Mouse1;
import com.company.Inheritance.Mouse2;
import com.company.Polymorphism.Bird;
import com.company.Polymorphism.Robin;

import java.util.Scanner;

public class Main {

    public static void inheritanceDemo(){
        System.out.println("INHERITANCE\n");
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
        System.out.println("POLYMORPHISM\n");
        Bird bird = new Bird();
        bird.sing();
        Robin robin = new Robin();
        robin.sing();
    }

    public static void classDemo(){
        System.out.println("CLASSES\n");
        Class1 c = new Class1();
        System.out.println(c.x);
        c.sayHi();

        Class2 c2 = new Class2();
        System.out.println(c2.y);
        System.out.println(c2.isValid("Valid"));
    }

    public static void abstractionDemo(){
        System.out.println("ABSTRACT CLASSES\n");
        Puppy pup = new Puppy();
        pup.bark();
        pup.poop();
    }

    public static void encapsulationDemo(){
        System.out.println("ENCAPSULATION\n");
        Student s = new Student();
        s.setName("Mike");
        s.setAge(21);

        System.out.println(s.getName());
        System.out.println(s.getAge());

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Select from categories below to see a demonstration:\n" +
                    "1. Inheritance\n" +
                    "2. Polymorphism\n" +
                    "3. Classes\n" +
                    "4. Abstract Classes\n" +
                    "5. Encapsulation\n" +
                    "6. Exit Program");
            int selection = scan.nextInt();
            System.out.println("\n*\n");
            switch (selection) {
                case 1 -> inheritanceDemo();
                case 2 -> polymorphismDemo();
                case 3 -> classDemo();
                case 4 -> abstractionDemo();
                case 5 -> encapsulationDemo();
                case 6 -> System.exit(200);
            }
            System.out.println("\n*\n");
        }
    }
}
