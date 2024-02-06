package jumpGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void expectedFalse() {
        Solution solution = new Solution();
        assertFalse(solution.canJump(new int[]{3, 2, 1, 0, 4}));
    }
    @Test
    public void expectedTrue() {
        Solution solution = new Solution();
        assertTrue(solution.canJump(new int[]{1,2,0,1}));
    }
    @Test
    public void expectedTrueOne() {
        Solution solution = new Solution();
        assertTrue(solution.canJump(new int[]{2,5,0,0}));
    }

}