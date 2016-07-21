package ir.hri.view;

import ir.hri.bl.ConCreteBuilder1;
import ir.hri.bl.Director;

public class App {
    public static void main(String[] args) {
        Director director = new Director();
        ConCreteBuilder1 creteBuilder1 = new ConCreteBuilder1();
        director.construct(creteBuilder1);
        System.out.println(creteBuilder1.getProduct().toString());
    }
}
