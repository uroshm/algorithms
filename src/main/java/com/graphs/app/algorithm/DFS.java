package com.graphs.app.algorithm;

import com.graphs.app.data.Graph;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DFS {

  private final Graph graph;
  HashMap<String, Boolean> visited = new HashMap<>();
  Deque<String> preVisit = new ArrayDeque<>();
  Deque<String> postVisit = new ArrayDeque<>();
  HashMap<String, Integer> cc = new HashMap<>();

  public void dfs() {
    var cc_counter = 0;
    var clock = 0;
    for (var vertexList : graph.adjacencyList) {
      var currentRoot = vertexList.get(0);
      visited.put(currentRoot, false);
      cc.put(currentRoot, -1);
    }

    for (var i = 0; i < graph.adjacencyList.length; i++) {
      var vertexList = graph.adjacencyList[i];
      var currentRoot = vertexList.get(0);
      if (!visited.get(currentRoot)) {
        cc_counter++;
        explore(graph.getAdjanceyListForVertex(currentRoot), cc_counter, clock);
      }
    }
    System.out.println("cc: " + cc_counter);
  }

  void explore(LinkedList<String> adjacencyList, Integer cc_counter, Integer clock) {
    var vertex = adjacencyList.get(0);
    visited.put(vertex, true);
    System.out.println("visited: " + vertex);
    cc.put(vertex, cc_counter);

    if (adjacencyList.size() == 1) {
      return;
    }

    for (var i = 1; i < adjacencyList.size(); i++) {
      var adjacentVertex = adjacencyList.get(i);
      var visitedFlag = visited.get(adjacentVertex);
      if (visitedFlag == null || !visitedFlag) {
        explore(graph.getAdjanceyListForVertex(adjacentVertex), cc_counter, clock);
      }
    }
  }
}
