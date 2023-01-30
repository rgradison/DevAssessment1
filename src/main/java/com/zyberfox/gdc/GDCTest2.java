package com.zyberfox.gdc;

public class GDCTest2 {
    public static void main(String[] args) {
        int[] numbers = new int[]{8,16,4,20,12,34,7};
        System.out.println(highestCommonFactor(numbers));
    }
    public static int highestCommonFactor(int[] numbers) {
        int result = numbers[0];
        for (int element : numbers){
            result = hcf(result, element);

            if(result == 1)
            {
                return 1;
            }
        }
        return result;
    }
    // Function to return gcd of a and b
    static int hcf(int result, int element)
    {
        if (result == 0)
            return element;
        return hcf(element % result, result);
    }
}
