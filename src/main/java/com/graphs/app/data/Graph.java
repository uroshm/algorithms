package com.graphs.app.data;

import java.util.HashMap;
import java.util.LinkedList;
import org.springframework.stereotype.Component;

@Component
public class Graph {
  public LinkedList<String>[] adjacencyList;

  public LinkedList<String> getAdjanceyListForVertex(String vertex) {
    for (var vertexList : adjacencyList) {
      if (vertexList.get(0).equals(vertex)) {
        return vertexList;
      }
    }
    return null;
  }

  public Graph getReversedGraph() {
    var reversedGraph = new Graph();
    var newAdjacencyList = new LinkedList[adjacencyList.length];
    var vertexToIndexMap = new HashMap<String, Integer>();

    // first set all vertices in the new adjacency list
    for (int i = 0; i < adjacencyList.length; i++) {
      newAdjacencyList[i] = new LinkedList<>();
      newAdjacencyList[i].add(adjacencyList[i].get(0));
      vertexToIndexMap.put(adjacencyList[i].get(0), i);
    }

    for (var vertexList : adjacencyList) {
      var vertex = vertexList.get(0);
      for (int i = 1; i < vertexList.size(); i++) {
        var neighbor = vertexList.get(i);
        int neighborIndex = vertexToIndexMap.get(neighbor);
        newAdjacencyList[neighborIndex].add(vertex);
      }
    }

    reversedGraph.adjacencyList = newAdjacencyList;
    return reversedGraph;
  }
}
