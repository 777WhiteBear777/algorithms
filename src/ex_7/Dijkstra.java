package ex_7;

import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class Dijkstra {

    int distance[];
    Set<Integer> settled;
    PriorityQueue<Node> priorityQueue;
    private int countCity;
    List<List<Node>> citiesDijkstra;

    public int[] getDistance() {
        return distance;
    }

    public Dijkstra(int countCity) {
        this.distance = new int[countCity];
        this.settled = new HashSet<>();
        this.priorityQueue = new PriorityQueue<>(countCity, new Node());
        this.countCity = countCity;
    }

    public void dijkstra(List<List<Node>> cities) {
        this.citiesDijkstra = cities;

        for (int i = 0; i < countCity; i++) {
            distance[i] = Integer.MAX_VALUE;

        }

        priorityQueue.add(new Node("Odessa", 0, null, 0));
        distance[0] = 0;
        while (settled.size() != countCity) {
            if (priorityQueue.isEmpty()) {
                return;
            }

            int id = priorityQueue.remove().getId();
            settled.add(id);

            nextCities(id);

        }
    }

    private void nextCities(int id) {
        int edgeDistance;
        int newDistance;

        for (int i = 0; i < citiesDijkstra.get(id).size(); i++) {
            Node node = citiesDijkstra.get(id).get(i);

            if (!settled.contains(node.getId())) {
                edgeDistance = node.getDistance();
                newDistance = distance[id] + edgeDistance;

                if (newDistance < distance[node.getId()]) {
                    distance[node.getId()] = newDistance;
                }

                priorityQueue.add(new Node(node.getNameNextCity(), node.getId(), node.getNameCity(), distance[node.getId()]));
            }

        }
    }
}
