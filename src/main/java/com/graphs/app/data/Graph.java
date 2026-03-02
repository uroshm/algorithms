package com.graphs.app.data;

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
    reversedGraph.adjacencyList = new LinkedList[adjacencyList.length];
    for (var i = 0; i < adjacencyList.length; i++) {
      var vertexList = adjacencyList[i];
      var vertex = vertexList.get(0);
      for (var j = 1; j < vertexList.size(); j++) {
        var adjacentVertex = vertexList.get(j);
        var reversedAdjacencyListForAdjacentVertex =
            reversedGraph.getAdjanceyListForVertex(adjacentVertex);
        if (reversedAdjacencyListForAdjacentVertex == null) {
          reversedAdjacencyListForAdjacentVertex = new LinkedList<>();
          reversedAdjacencyListForAdjacentVertex.add(adjacentVertex);
          reversedGraph.adjacencyList[i] = reversedAdjacencyListForAdjacentVertex;
        }
        reversedAdjacencyListForAdjacentVertex.add(vertex);
      }
    }
    return reversedGraph;
  }
}
