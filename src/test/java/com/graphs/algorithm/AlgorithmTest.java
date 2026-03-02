package com.graphs.algorithm;

import com.graphs.app.algorithm.DFS;
import com.graphs.app.data.Graph;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;

public class AlgorithmTest {

  @Test
  void demo() {
    var dfs = new DFS(setupDemo());
    dfs.dfs();
  }

  Graph setupDemo() {
    var graph = new Graph();

    graph.adjacencyList = new LinkedList[4];
    graph.adjacencyList[0] = new LinkedList<String>();
    graph.adjacencyList[0].add("A");
    graph.adjacencyList[0].add("B");
    graph.adjacencyList[1] = new LinkedList<String>();
    graph.adjacencyList[1].add("B");
    graph.adjacencyList[1].add("A");
    graph.adjacencyList[1].add("C");

    graph.adjacencyList[2] = new LinkedList<String>();
    graph.adjacencyList[2].add("C");
    graph.adjacencyList[2].add("B");

    graph.adjacencyList[3] = new LinkedList<String>();
    graph.adjacencyList[3].add("D");

    return graph;
  }
}
