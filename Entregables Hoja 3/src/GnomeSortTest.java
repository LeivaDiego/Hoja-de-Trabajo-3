import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GnomeSortTest {
    int[] nums;
    GnomeSort g = new GnomeSort();
    public void setup(){

        nums = new int[3];
        nums[0] = 1535;
        nums[1] = 100;
        nums[2] = 2396;
    }
    @Test
    void gnomeSortTest() {
        setup();
        g.gnomeSort(nums,nums.length);
        assertEquals(100,nums[0]);
    }
}