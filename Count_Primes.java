public class Solution {

    public int countPrimes(int n) {
        
        boolean[] isMultipliesArray = new boolean[n];
        int countOfPrime = 0;
        for (int i = 2; i < n; i++) {
            if (isMultipliesArray[i]) continue;

            countOfPrime++;
            for (int j = i; j < n; j = j + i) isMultipliesArray[j] = true;
        }

        return countOfPrime;
    }
    
}