package domain;

public class Exercise {
    public static String Calculate(int n) {
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        StringBuilder primeNumbers = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.append(i).append(", ");
            }
        }

        return primeNumbers.toString();
    }
}
