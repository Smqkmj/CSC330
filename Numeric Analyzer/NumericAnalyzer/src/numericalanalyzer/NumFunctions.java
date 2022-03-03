package numericalanalyzer;

import java.util.Arrays;

public class NumFunctions {
    private int[] numArray;
    private final int size;
    double sum = 0;
    double mean;
    double minVal;
    double maxVal;
    double variance;

    public NumFunctions(int[] numArr) {
        numArray = numArr;
        size = numArray.length;
    }

    // return array
    public int[] getArray() {
        return numArray;
    }

    // sort array
    public int[] sort() {
        Arrays.sort(numArray);
        return numArray;
    }

    // size of array
    public int sizeOfArray()

    {
        int size;
        size = numArray.length;
        return size;
    }

    // The sum
    public double sumOfArray() {

        for (int i = 0; i < size; i++) {
            sum += numArray[i];
        }
        return sum;
    }

    // mean value
    public double mean() {

        mean = sum / (float) size;
        return mean;
    }

    // median
    public double median() {
        double median;
        if (size % 2 != 0)
            median = (double) numArray[size / 2];
        else
            median = (double) (numArray[(size - 1) / 2] + numArray[size / 2]) / 2.0;
        return median;
    }

    // The min value.
    public double minValue() {

        minVal = numArray[0];
        return minVal;
    }

    // The max value.
    public double maxValue() {

        maxVal = numArray[numArray.length - 1];
        return maxVal;
    }

    // range
    public double rangeofArray() {
        double range;
        range = maxVal - minVal;
        return range;
    }

    // variance
    public double variance() {
        for (int i = 0; i < size; i++) {
            variance += Math.pow(numArray[i] - mean, 2);
        }
        variance /= size;
        return variance;
    }

    // standard deviance
    public double standardDeviance() {
        double sD;
        sD = Math.sqrt(variance);
        return sD;
    }
}
