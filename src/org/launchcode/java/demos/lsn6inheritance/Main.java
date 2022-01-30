package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String args[]) {
        HouseCat newCat = new HouseCat("Bello", 23);
        newCat.eat();

        System.out.println(newCat.getWeight());

        //Cat secondCat = new Cat();
      //  System.out.println(secondCat.noise());
        System.out.println(newCat.noise());


        Cat garfield = new HouseCat("Garfield", 900);
        System.out.println(((HouseCat) garfield).isSatisfied());
    }
}
