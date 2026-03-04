package com.graphs.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GraphTest {

  private TestUtil testUtil = new TestUtil();

  @Test
  void reverseGraph_3_3() {
    var graph = testUtil.setup_DPV_3_3();
    var reversedGraph = graph.getReversedGraph();
    System.out.println("Original graph:");
    for (var vertexList : graph.adjacencyList) {
      System.out.println(vertexList);
    }
    System.out.println("Reversed graph:");
    for (var vertexList : reversedGraph.adjacencyList) {
      System.out.println(vertexList);
    }
    assertEquals(graph.adjacencyList.length, reversedGraph.adjacencyList.length);
    assertEquals(graph.adjacencyList[0].get(0), reversedGraph.adjacencyList[0].get(0));
  }

  @Test
  void reverseGraph_3_2_a() {
    var graph = testUtil.setup_DPV_3_2_a();
    var reversedGraph = graph.getReversedGraph();
    System.out.println("Original graph:");
    for (var vertexList : graph.adjacencyList) {
      System.out.println(vertexList);
    }
    System.out.println("Reversed graph:");
    for (var vertexList : reversedGraph.adjacencyList) {
      System.out.println(vertexList);
    }
    assertEquals(graph.adjacencyList.length, reversedGraph.adjacencyList.length);
    assertEquals(graph.adjacencyList[0].get(0), reversedGraph.adjacencyList[0].get(0));
  }
}
