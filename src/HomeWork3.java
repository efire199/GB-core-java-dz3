
import secondClasses.*;

import java.util.ArrayList;

public class HomeWork3 {
    public static void main(String[] args) {
        Box<Apple> a1 = new Box<>();
        Box<Apple> a2 = new Box<>();
        Box<Orange> o1 = new Box<>();

        for (int i=0; i<5; i++){
            a1.addFruit(new Apple());
        }
        for (int i=0; i<6; i++){
            o1.addFruit(new Orange());
        }

        System.out.println("Вес коробки a1: " + a1.getWeight());
        System.out.println("Вес коробки a2: " + a2.getWeight());
        System.out.println("Вес коробки o1: " + o1.getWeight());
        System.out.println("Равны ли коробки по весу: " + a1.compare(o1));

        for (int i=0; i<4; i++){
            a1.addFruit(new Apple());
        }

        System.out.println("Вес коробки a1: " + a1.getWeight());
        System.out.println("Вес коробки a2: " + a2.getWeight());
        System.out.println("Вес коробки o1: " + o1.getWeight());
        System.out.println("Равны ли коробки по весу: " + a1.compare(o1));

        a2.compare(a1);

        a1.move(a2);
        System.out.println("Вес коробки a1: " + a1.getWeight());
        System.out.println("Вес коробки a2: " + a2.getWeight());
    }
}
