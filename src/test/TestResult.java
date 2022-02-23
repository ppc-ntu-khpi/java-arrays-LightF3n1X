package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args)
    {
        int n = 100;
        System.out.print("Following are the prime numbers in range of 0 to " + n + ": ");
        String primeNumbers = Exercise.Calculate(n);
        System.out.print(primeNumbers);
    }
}
