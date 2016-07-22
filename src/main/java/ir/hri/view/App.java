package ir.hri.view;

import ir.hri.bl.ConcreteBuilder1;
import ir.hri.bl.Director;

public class App {
    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuilder1 creteBuilder1 = new ConcreteBuilder1();
        director.construct(creteBuilder1);
        System.out.println(creteBuilder1.getProduct().toString());
    }
}
