package ex_7;

import java.util.Comparator;

public class Node implements Comparator<Node> {
    private String nameCity;
    private int id;
    private String nameNextCity;
    private int distance;

    public String getNameCity() {
        return nameCity;
    }

    public String getNameNextCity() {
        return nameNextCity;
    }

    public int getDistance() {
        return distance;
    }

    public int getId() {
        return id;
    }

    public Node() {
    }

    public Node(String nameCity) {
        this.nameCity = nameCity;
    }

    public Node(String nameNextCity, int id, String nameCity, int distance) {
        this.nameNextCity = nameNextCity;
        this.id = id;
        this.nameCity = nameCity;
        this.distance = distance;
    }

    @Override
    public int compare(Node node1, Node node2) {
        return Integer.compare(node1.distance, node2.distance);
    }
}
