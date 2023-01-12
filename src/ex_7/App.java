package ex_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class App {


    public static void main(String[] args) {

        List<List<Node>> cites = new InitData().getData();

        AlgorithmDijkstra algorithmDijkstra = new AlgorithmDijkstra(cites.size());
        algorithmDijkstra.init(cites);

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println(" Enter your cite : ");
            String line = reader.readLine();

            for (int i = 0; i < cites.size(); i++) {
                if (line.equalsIgnoreCase(cites.get(i).get(0).getNameCity())) {
                    System.out.println("Odessa to " + line);
                    System.out.println("Way: " + algorithmDijkstra.way[i]);
                    System.out.println("Distance: " + algorithmDijkstra.distance[i]);
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
