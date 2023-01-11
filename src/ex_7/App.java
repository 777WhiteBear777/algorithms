package ex_7;

import java.util.*;

public class App {
    public static void main(String[] args) {

        int countCity = 17;

        List<List<Node>> cites = new ArrayList<>();

        for (int i = 0; i < countCity; i++) {
            List<Node> item = new ArrayList<>();
            cites.add(item);
        }

        //Odessa-0***Uman-1***Nikolaev-2***Kiev-3***Vinitsa-4***Kropivnitskiy-5
        //Kherson-6***KrivoiRog-7***Dnepr-8***Poltava-9***Kharkov-10***Symi-11
        //Zitomir-12***Khmelnitskiy-13***Rivne-14***Ternopil-15***Lvov-16

        cites.get(0).add(new Node("Uman","Odessa",271));
        cites.get(0).add(new Node("Nikolaev","Odessa",132));

        cites.get(1).add(new Node("Kiev","Uman",212));
        cites.get(1).add(new Node("Vinitsa","Uman",160));
        cites.get(1).add(new Node("Kropivnitskiy","Uman",167));

        cites.get(2).add(new Node("Kherson","Nikolaev",71));
        cites.get(2).add(new Node("KrivoiRog","Nikolaev",204));

        cites.get(3).add(new Node("Zitomir","Kiev",140));
        cites.get(3).add(new Node("Poltava","Kiev",342));

        cites.get(4).add(new Node("Khmelnitskiy","Vinitsa",122));

        cites.get(5).add(new Node("KrivoiRog","Kropivnitskiy",119));
        cites.get(5).add(new Node("Dnepr","Kropivnitskiy",245));

        cites.get(6).add(new Node("Kherson"));

        cites.get(7).add(new Node("Dnepr","KrivoiRog",146));

        cites.get(8).add(new Node("Kharkov","Dnepr",216));

        cites.get(9).add(new Node("Kharkov","Poltava",143));

        cites.get(10).add(new Node("Symi","Kharkov",183));

        cites.get(11).add(new Node("Symi"));

        cites.get(12).add(new Node("Rivne","Zitomir",188));

        cites.get(13).add(new Node("Ternopil","Khmelnitskiy",111));

        cites.get(14).add(new Node("Lvov","Rivne",121));

        cites.get(15).add(new Node("Rivne","Ternopil",159));
        cites.get(15).add(new Node("Lvov","Ternopil",127));

        cites.get(16).add(new Node("Lvov"));
        System.out.println(cites.get(1));

        Dijkstra dijkstra = new Dijkstra(countCity);
        dijkstra.dijkstra(cites);

        System.out.println(dijkstra.cities);

    }

}
