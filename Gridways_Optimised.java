public class Gridways_Optimised {
    public static int gridWays(int m, int n) {
        int totalMoves = m + n - 2;
        int r = Math.min(m - 1, n - 1); // choose smaller for efficiency
        long result = 1;

        for (int i = 1; i <= r; i++) {
            result = result * (totalMoves - r + i) / i;
        }

        return (int) result;
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        int result = gridWays(m, n);
        System.out.println("Total gridways here: " + result);
    }
}
