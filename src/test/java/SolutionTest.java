import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();

  @Test
  void plusOneExample1() {
    assertArrayEquals(new int[]{1, 2, 4},
        sol.plusOne(new int[]{1, 2, 3}));
  }

  @Test
  void plusOneExample2() {
    assertArrayEquals(new int[]{4, 3, 2, 2},
        sol.plusOne(new int[]{4, 3, 2, 1}));
  }
  @Test
  void plusOneExample3() {
    assertArrayEquals(new int[]{1,0},
        sol.plusOne(new int[]{9}));
  }
}