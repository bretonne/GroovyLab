class SumParts {
    public static int[] sumParts(int[] ls) {
        if (ls==null || ls.length==0)
            return [0];

        def b = [0];
        int sum = 0;
        for (int i= ls.length-1; i>=0; i--) {
            sum += ls[i];
            b.add(sum);
        }
        b.reverse();
    }
}