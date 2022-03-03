package numericalanalyzer;

import java.util.Arrays;

public class NumericAnalyzer {
    public static void main(String[] args) throws Exception {

        int numArray[] = new int[args.length];
        if (args.length == 0) {
            System.out.println("Please enter at least 1 number");
            System.exit(1);
        }

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = Integer.parseInt(args[i]);
        }

        NumFunctions numAnalyze = new NumFunctions(numArray);
        System.out.println("Your Array " + Arrays.toString(numAnalyze.getArray()));
        System.out.println("Sorted Array " + Arrays.toString(numAnalyze.sort()));
        System.out.println("Size: " + numAnalyze.sizeOfArray());
        System.out.println("Sum: " + numAnalyze.sumOfArray());
        System.out.println("Mean/Average: " + numAnalyze.mean());
        System.out.println("Median: " + numAnalyze.median());
        System.out.println("Minimum value: " + numAnalyze.minValue());
        System.out.println("Maximum value: " + numAnalyze.maxValue());
        System.out.println("Range: " + numAnalyze.rangeofArray());
        System.out.println("Variance: " + numAnalyze.variance());
        System.out.println("Standard deviation: " + numAnalyze.standardDeviance());

    }
}
