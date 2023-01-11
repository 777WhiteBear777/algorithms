package ex_7;

import java.util.Comparator;

public class Node implements Comparator<Node> {
    private String nameCity;

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

    public Node() {
    }

    public Node(String nameCity) {
        this.nameCity = nameCity;
    }

    public Node(String nameNextCity, String nameCity, int distance) {
        this.nameCity = nameCity;
        this.nameNextCity = nameNextCity;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "| "+nameCity + " -> " +
                "nameNextCity = " + nameNextCity +
                ", distance = " + distance +
                ';';
    }

    @Override
    public int compare(Node node1, Node node2) {
        return Integer.compare(node1.distance, node2.distance);
    }
}
