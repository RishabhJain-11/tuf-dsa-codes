package leetcode;

public class ColoredCells {
    public static void main(String[] args) {
        int nums = 2;
        System.out.println(coloredCells(nums));
    }

    private static long coloredCells(int n) {
        return 1L + 2L * (n - 1) * n;
    }
}

/*
The problem follows a pattern where the number of blue cells grows symmetrically outward from a starting point. Let's analyze how the number of blue cells increases over time:

Observing the pattern:
Minute 1: Only 1 cell is colored.
Total Cells = 1
Minute 2: The initial cell spreads to its 4 adjacent cells.
Total Cells = 1 + 4 = 5
Minute 3: Each of the outermost blue cells spreads, forming a diamond shape.
Total Cells = 1 + 4 + 8 = 13
Minute 4: The expansion continues outward symmetrically.
Total Cells = 1 + 4 + 8 + 12 = 25
The pattern follows the sum of an arithmetic series: Total Cells=1+2(n−1)n

Total Cells=1+2(n−1)n
Implementing in Java:
class Solution {
    public long coloredCells(int n) {
        return 1L + 2L * (n - 1) * n;
    }
}

Complexity Analysis:
The formula runs in O(1) time.
The space complexity is O(1) since we use only a few variables.
This approach efficiently calculates the number of colored cells for any given n without simulating the grid expansion. 🚀
 */