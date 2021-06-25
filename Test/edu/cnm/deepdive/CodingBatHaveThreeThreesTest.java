package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatHaveThreeThrees.haveThree;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatHaveThreeThreesTest {

  private int[][] threeParams = {
      {3, 1, 3, 1, 3},
      {3, 1, 3, 3},
      {3, 4, 3, 3, 4},
      {1, 3, 1, 3, 1, 2},
      {1, 3, 1, 3, 1, 3},
      {1, 3, 3, 1, 3},
      {1, 3, 1, 3, 1, 3, 4, 3},
      {3, 4, 3, 4, 3, 4, 4},
      {3, 3, 3},
      {1, 3},
      {3},
      {1}
  };

  private boolean[] threeExpected = {true, false, false, false, true, false, false, true, false, false,
  false, false};

  @Test
  void threeTest() {
    for (int i = 0; i < threeParams.length; i++) {
      boolean actual = haveThree(threeParams[i]);
      Assertions.assertEquals(actual, threeExpected[i]);
    }
  }

}