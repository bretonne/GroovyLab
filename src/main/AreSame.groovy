

class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if (a==null || b==null)
            return false;
        if (a.length != b.length)
            return false;

        List aList = a.toList();
        List bList = b.toList();

        aList.each{
            int squareA = it * it
            println it + ' ' + squareA
            int pos = bList.indexOf(squareA)
            if (pos>=0)
                bList.remove(pos);
            else
                return false;
        }
        if (bList.isEmpty())
            return true;

        println 'remaining b: '
        bList.each { print(it + ' ')};
        return false;
    }
}
