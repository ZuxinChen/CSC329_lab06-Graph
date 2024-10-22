package org.example;

/**
 * Create the Edge class with the following members:
 * • Member variables for source, destination, and weight. They should all have the data type int.
 * These variables should have package scope (leave out the access modifier for package scope).
 * • Constructor that sets all three member variables.
 */
public class Edge {
    private int source;
    private int destination;
    private int weight;

    public Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
