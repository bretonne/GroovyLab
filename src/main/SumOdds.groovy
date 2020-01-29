class SumOdds {
    static rowSumOddNumbers(n) {
        int odd = 1;
        int sum = odd;
        for (int i=0; i<n; i++) {
            sum =0;
            for (int j=0; j<=i; j++) {
                if (i==n-1)
                    sum += odd;
                odd += 2;
            }
        }
        return sum;
    }
}
