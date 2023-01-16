package ex_0;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Animals> animals = new ArrayList<>();
        animals.add(new Animals(1));
        animals.add(new Animals(2));
        animals.add(new Animals(3));

        outPrint(animals);

        System.out.println("------------------------");

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        outPrint(cats);

//            Object
//            Animal     super up   :    extends down
//            Cat
    }

    public static void outPrint(List<? extends Animals> list){
        for (Animals animals : list){
            animals.eat();
        }
    }
}
