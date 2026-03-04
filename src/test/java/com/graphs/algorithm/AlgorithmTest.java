package com.graphs.algorithm;

import com.graphs.app.algorithm.DFS;
import org.junit.jupiter.api.Test;

public class AlgorithmTest {

  private TestUtil testUtil = new TestUtil();

  @Test
  void DPV_Problem_3_3() {
    var dfs = new DFS(testUtil.setup_DPV_3_3());
    dfs.dfs();
  }
}
