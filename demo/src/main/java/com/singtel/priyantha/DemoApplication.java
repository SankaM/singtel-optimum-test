package com.singtel.priyantha;

import com.singtel.priyantha.animal.bird.Bird;
import com.singtel.priyantha.animal.bird.Chicken;
import com.singtel.priyantha.animal.bird.Duck;

public class DemoApplication {

    public static void main(String[] args) {

        answerQA1();
        answersQA2();
    }
    public static void answerQA1(){
        System.out.println("A. Let’s start with the basics");
        System.out.println("    Q1. a. and b. Unit test  answers are in BirdTest.java > testSinging(), testWalk(), testFly()...");

        System.out.println("    Q1a) Demo bird singing ");
        Bird b1 = new Bird();
        b1.sing();
    }

    public static void answersQA2(){
        System.out.println("Q2. a), b),c), d) unit tests: BirdTest.java > testQ2a(), testQ2b(), testQ2c(), testQ2d()");

        Duck d1 = new Duck();
        d1.say();
        d1.swim();

        Chicken c1 = new Chicken();
        c1.say();
        c1.fly();
    }

}
