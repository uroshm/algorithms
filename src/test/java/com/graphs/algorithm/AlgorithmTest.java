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

  @Test
  void dpv_figure_3_7() {
    var dfs = new DFS(setup_3_7());
    dfs.dfs();
  }

  Graph setup_3_7() {
    var graph = new Graph();

    graph.adjacencyList = new LinkedList[8];
    graph.adjacencyList[0] = new LinkedList<String>();
    graph.adjacencyList[0].add("A");
    graph.adjacencyList[0].add("B");
    graph.adjacencyList[0].add("C");
    graph.adjacencyList[0].add("F");

    graph.adjacencyList[1] = new LinkedList<String>();
    graph.adjacencyList[1].add("B");
    graph.adjacencyList[1].add("E");

    graph.adjacencyList[2] = new LinkedList<String>();
    graph.adjacencyList[2].add("C");
    graph.adjacencyList[2].add("D");

    graph.adjacencyList[3] = new LinkedList<String>();
    graph.adjacencyList[3].add("D");
    graph.adjacencyList[3].add("A");
    graph.adjacencyList[3].add("H");

    graph.adjacencyList[4] = new LinkedList<String>();
    graph.adjacencyList[4].add("E");
    graph.adjacencyList[4].add("F");
    graph.adjacencyList[4].add("G");
    graph.adjacencyList[4].add("H");

    graph.adjacencyList[5] = new LinkedList<String>();
    graph.adjacencyList[5].add("F");
    graph.adjacencyList[5].add("G");

    graph.adjacencyList[6] = new LinkedList<String>();
    graph.adjacencyList[6].add("G");

    graph.adjacencyList[7] = new LinkedList<String>();
    graph.adjacencyList[7].add("H");
    graph.adjacencyList[7].add("G");

    return graph;
  }
}
