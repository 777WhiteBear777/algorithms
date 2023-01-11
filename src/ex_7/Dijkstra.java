package ex_7;

import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class Dijkstra {

    private int distance[];
    private Set<Integer> settled;
    private PriorityQueue<Node> priorityQueue;
    private int countCity;
    List<List<Node>> cities;

    public Dijkstra(int countCity) {
        this.distance = new int[countCity];
        this.settled = new HashSet<>();
        this.priorityQueue = new PriorityQueue<>(countCity, new Node());
        this.countCity = countCity;
    }

    public void dijkstra(List<List<Node>> cities) {
        this.cities = cities;

        priorityQueue.add(new Node("Odessa"));
        distance[0] = 0;
        while (settled.size() != countCity) {
            if (priorityQueue.isEmpty()) {
                return;
            }

            int u = priorityQueue.remove().getDistance();
            settled.add(u);

        }
    }

    private void nextCities(int nextCites) {
        int edgeDistance = -1;
        int newDistance = -1;

        for (int i = 0; i < cities.get(nextCites).size(); i++) {
            Node node = cities.get(nextCites).get(i);

            if (!settled.contains(node.getDistance())) {
                edgeDistance = node.getDistance();
                newDistance = distance[nextCites] + edgeDistance;

                if (newDistance < distance[node.getDistance()]) {
                    distance[node.getDistance()] = newDistance;
                }

                priorityQueue.add(new Node());
            }

        }
    }
}
