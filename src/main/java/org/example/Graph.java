package org.example;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Create the graph class with the following members:
 * • Member variable for vertices. Should be a list of vertices. You can use the Java LinkedList class
 * for the list. Use Integer for the LinkedList generic data type.
 * • Member variable for the adjacency lists. Should be a map of vertices to lists of edges. It should
 * have Integer as the key and a list of edges as the value. Use the Java HashMap class for the map.
 * • Default constructor that creates instances for vertices and edges collections.
 * • void addVertex(int v).
 * o Add a vertex to the vertex collection.
 * o Add a key/value pair for the adjacency list for this new vertex. Hint: Need to add an
 * empty adjacency list.
 * • void addEdge(int source, int destination, int weight).
 * o Create a new instance of edge.
 * o Add the new edge to the adjacency list for the source.
 * o Add the new edge to the adjacency list for the destination.
 * • void showGraph() – Should show all the vertices and edges on the screen.
 */
public class Graph {
    List<Integer> vertices;
    Map<Integer,List<Edge>> adjList;

    /**
     * Default constructor that creates instances for vertices and edges collections.
     */
    public Graph() {
        vertices = new LinkedList<>();
        adjList = new HashMap<>();
    }

    /**
     * Add a vertex to the vertex collection.
     * Add a key/value pair for the adjacency list for this new vertex. Hint: Need to add an
     *  empty adjacency list.
     */
    public void addVertex(int v){
        vertices.add(v);
        adjList.put(v,new LinkedList<>());
    }

    /**
     * o Create a new instance of edge.
     * o Add the new edge to the adjacency list for the source.
     * o Add the new edge to the adjacency list for the destination.
     */
    public void addEdge(int source, int destination, int weight){
        Edge edge = new Edge(source,destination,weight);
        List<Edge> edges = new LinkedList<>();
        edges.add(edge);
        adjList.put(source,edges);
        adjList.put(destination,edges);
    }

    /**
     * • void showGraph() – Should show all the vertices and edges on the screen.
     */

    public void showGraph(){
        System.out.println("Vertices");
        vertices.forEach(e->System.out.print(e+" "));
        System.out.println("Edges");

    }

    /**
     * boolean hasEdge(int source, int destination)
     * This method should return true if the graph contains an undirected edge from source to destination (or
     * vice versa since the edge is undirected).
     * Write code to test this method in main.
     */

    public boolean hasEdge(int source, int destination){
        return false;
    }




}
