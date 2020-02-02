package com.singtel.priyantha;

import com.singtel.priyantha.animal.bird.Bird;
import com.singtel.priyantha.animal.bird.Chicken;
import com.singtel.priyantha.animal.bird.Duck;
import com.singtel.priyantha.animal.bird.Rooster;
import com.singtel.priyantha.animal.fish.ClownFish;
import com.singtel.priyantha.animal.fish.Fish;
import com.singtel.priyantha.animal.fish.Shark;

public class DemoApplication {

    public static void main(String[] args) {

        answerQA1();
        answersQA2();
        answersQA3();

        answersQB1();
        answersQB2();
    }
    public static void answerQA1(){
        System.out.println("A. Let’s start with the basics \n");
        System.out.println("    Q1. a. and b. Unit test  answers are in BirdTest.java > testSinging(), testWalk(), testFly()...");

        System.out.println("    Q1a) Demo bird singing ");
        Bird b1 = new Bird();
        b1.sing();
    }

    public static void answersQA2(){
        System.out.println("\n  Q2. a), b),c), d) unit tests: BirdTest.java > testQ2a(), testQ2b(), testQ2c(), testQ2d()");

        Duck d1 = new Duck();
        d1.say();
        d1.swim();

        Chicken c1 = new Chicken();
        c1.say();
        c1.fly();
    }

    public static void answersQA3(){
        System.out.println("\n  Q3. Unit tests: BirdTest.java > testQ3a()");

        Rooster r1 = new Rooster();
        r1.say();

        System.out.println("    Q3 b. How is the rooster related to the chicken? >> Rooster is a Chicken. Can be considered as a child of chicken");
        System.out.println("    Q3 c. Can you think of other ways to model a rooster without using inheritance? >>\n" +
                "    >> Yes, By using flag in Chicken class saying isRooster, if it is true then set chicken sounds like a rooster\n");

    }

    public static void answersQB1(){
        System.out.println("\n B. Model fish as well as other swimming animals");

        System.out.println("    Unit tests for QB1 FishTest.java >> testB1b(), testB1c()");

        Fish f1 = new Fish();
        f1.walk();
        f1.swim();
    }

    public static void answersQB2(){
        System.out.println("    Unit tests for QB2. FishTest.java >> testB2abcd()");

        Shark s1 = new Shark();
        System.out.println("    Shark size: " +s1.getSize());
        System.out.println("    Shark color: " +s1.getColor());
        System.out.println("    Shark eat other fish: "+ s1.isEatOtherFish());

        ClownFish c1 = new ClownFish();
        System.out.println("\n    Clownfish size : "+ c1.getSize());
        System.out.println("    Clownfish color : "+ c1.getColor());
        System.out.println("    Clownfish make jokes : "+ c1.isMakeJokes());
    }


}
