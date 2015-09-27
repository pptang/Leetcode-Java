public class Solution {
    public int countPrimes(int n) {
        
        if (n < 3) return 0;
        
        int countOfPrimes = 1; // 2
        
        for (int i = 3; i < n; i += 2) {
            
            if (isPrime(i)) {
                countOfPrimes++;
            }
        }
        return countOfPrimes;
    }
    
    private boolean isPrime(int number) {
        boolean numberIsPrime = true;
        
        if (number % 2 == 0) return false;
        
        for (int j = 3; j <= Math.sqrt(number); j = j + 2) {
            if (number % j == 0) {
                numberIsPrime = false;
                break;
            }
        }
        return numberIsPrime;
        
    }
    
}