package ex_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

        cites.get(0).add(new Node("Uman", 1, "Odessa", 271));
        cites.get(0).add(new Node("Nikolaev", 2, "Odessa", 132));

        cites.get(1).add(new Node("Kiev", 3, "Uman", 212));
        cites.get(1).add(new Node("Vinitsa", 4, "Uman", 160));
        cites.get(1).add(new Node("Kropivnitskiy", 5, "Uman", 167));

        cites.get(2).add(new Node("Kherson", 6, "Nikolaev", 71));
        cites.get(2).add(new Node("KrivoiRog", 7, "Nikolaev", 204));

        cites.get(3).add(new Node("Zitomir", 12, "Kiev", 140));
        cites.get(3).add(new Node("Poltava", 9, "Kiev", 342));

        cites.get(4).add(new Node("Khmelnitskiy", 13, "Vinitsa", 122));

        cites.get(5).add(new Node("KrivoiRog", 7, "Kropivnitskiy", 119));
        cites.get(5).add(new Node("Dnepr", 8, "Kropivnitskiy", 245));

        cites.get(6).add(new Node("Kherson"));

        cites.get(7).add(new Node("Dnepr", 8, "KrivoiRog", 146));

        cites.get(8).add(new Node("Kharkov", 10, "Dnepr", 216));

        cites.get(9).add(new Node("Kharkov", 10, "Poltava", 143));

        cites.get(10).add(new Node("Symi", 11, "Kharkov", 183));

        cites.get(11).add(new Node("Symi"));

        cites.get(12).add(new Node("Rivne", 14, "Zitomir", 188));

        cites.get(13).add(new Node("Ternopil", 15, "Khmelnitskiy", 111));

        cites.get(14).add(new Node("Lvov", 16, "Rivne", 121));

        cites.get(15).add(new Node("Rivne", 14, "Ternopil", 159));
        cites.get(15).add(new Node("Lvov", 16, "Ternopil", 127));

        cites.get(16).add(new Node("Lvov"));

        Dijkstra dijkstra = new Dijkstra(countCity);
        dijkstra.dijkstra(cites);

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println(" Enter your cite : ");
            String line = reader.readLine();
            for (int i = 0; i < dijkstra.getDistance().length; i++) {
                if (line.equalsIgnoreCase(cites.get(i).get(0).getNameCity())) {
                    System.out.println("Odessa to " + cites.get(i).get(0).toString() + " " + dijkstra.distance[i]);
                    break;
                }
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
