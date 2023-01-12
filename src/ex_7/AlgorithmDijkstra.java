package ex_7;

import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class AlgorithmDijkstra {

    int[] distance;
    Set<Integer> settled;
    PriorityQueue<Node> priorityQueue;
    private final int countCity;
    String[] way;

    List<List<Node>> citiesDijkstra;

    public int[] getDistance() {
        return distance;
    }

    public AlgorithmDijkstra(int countCity) {
        this.distance = new int[countCity];
        this.settled = new HashSet<>();
        this.priorityQueue = new PriorityQueue<>(countCity, new Node());
        this.countCity = countCity;
        this.way = new String[countCity];
    }

    public void init(List<List<Node>> cities) {

        this.citiesDijkstra = cities;

        for (int i = 0; i < countCity; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        priorityQueue.add(new Node("Odessa", 0, null, 0));
        way[0] = "Odessa";
        distance[0] = 0;

        while (settled.size() != countCity) {
            if (priorityQueue.isEmpty()) {
                return;
            }

            int id = priorityQueue.remove().getId();
            settled.add(id);

            calc(id);

        }
    }

    private void calc(int id) {

        int edgeDistance;
        int newDistance;
        String edgeCities;
        String newCities;

        for (int i = 0; i < citiesDijkstra.get(id).size(); i++) {

            Node node = citiesDijkstra.get(id).get(i);

            if (!settled.contains(node.getId())) {

                edgeDistance = node.getDistance();
                newDistance = distance[id] + edgeDistance;

                edgeCities = node.getNameNextCity();
                newCities = way[id] + " -> " + edgeCities;

                if (newDistance < distance[node.getId()]) {
                    distance[node.getId()] = newDistance;
                    way[node.getId()] = newCities;
                }

                priorityQueue.add(new Node(way[node.getId()], node.getId(), node.getNameNextCity(), distance[node.getId()]));

            }
        }
    }

}
