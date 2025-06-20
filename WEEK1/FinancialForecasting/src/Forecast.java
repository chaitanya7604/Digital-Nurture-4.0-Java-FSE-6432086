package WEEK1.FinancialForecasting.src;
public class Forecast {

    public static double futureValue(double initialAmount, double growthRate, int years) {
        if (years == 0) {
            return initialAmount;
        }

        return futureValue(initialAmount, growthRate, years - 1) * (1 + growthRate);
    }

    public static double futureValueMemo(double[] memo, double initialAmount, double growthRate, int years) {
        if (years == 0) return initialAmount;
        if (memo[years] != 0) return memo[years];
        memo[years] = futureValueMemo(memo, initialAmount, growthRate, years - 1) * (1 + growthRate);
        return memo[years];
    }

    public static void main(String[] args) {
        double initialAmount = 10000.0; 
        double growthRate = 0.10;       
        int years = 5;

        double result = futureValue(initialAmount, growthRate, years);
        System.out.println("Future Value after " + years + " years (recursive): $" + result);

       
        double[] memo = new double[years + 1];
        double resultMemo = futureValueMemo(memo, initialAmount, growthRate, years);
        System.out.println("Future Value after " + years + " years (memoized): $" + resultMemo);
    }
}