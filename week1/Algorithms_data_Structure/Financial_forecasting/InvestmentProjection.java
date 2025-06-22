public class InvestmentProjection {
    public static void main(String[] args) {
        double principal = 10000;
        double growthRate = 0.08;
        int duration = 5;

        double resultRecursive = calculateGrowthRecursive(principal, growthRate, duration);
        System.out.println("Projected Value using Recursion for " + duration + " years: Rs. " + resultRecursive);

        System.out.println("\nTime Complexity:");
        System.out.println("Recursive Method: O(n), where n is the number of years");

        System.out.println("\nMemoized Version (Optimized):");
        double[] cache = new double[duration + 1];
        double resultMemoized = calculateGrowthMemo(principal, growthRate, duration, cache);
        System.out.println("Projected Value using Memoization: Rs. " + resultMemoized);
    }

    static double calculateGrowthRecursive(double base, double rate, int time) {
        if (time == 0) {
            return base;
        }
        return calculateGrowthRecursive(base, rate, time - 1) * (1 + rate);
    }

    static double calculateGrowthMemo(double base, double rate, int time, double[] memo) {
        if (time == 0) {
            return base;
        }
        if (memo[time] != 0) {
            return memo[time];
        }
        memo[time] = calculateGrowthMemo(base, rate, time - 1, memo) * (1 + rate);
        return memo[time];
    }
}
