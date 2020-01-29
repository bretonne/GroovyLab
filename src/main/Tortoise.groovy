package main

class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        if (v1 >= v2)
            return null;
        int[] timeFormatted = new int[3];
        int hour,min,second;
        float hoursToCatchUp, minutesToCatchup, secondsToCatchup;

        hoursToCatchUp = (float)g/(v2-v1);
        hour = Math.round(hoursToCatchUp);
        if (hour > hoursToCatchUp)
            hour -= 1;
        timeFormatted[0] = hour;

        minutesToCatchup = (hoursToCatchUp - hour) * 60;
        min = Math.round(minutesToCatchup);
        if (min > minutesToCatchup)
            min -= 1;
        timeFormatted[1] = min;

        secondsToCatchup = (minutesToCatchup - min) * 60;
        second = Math.round(secondsToCatchup);
        if (second > secondsToCatchup)
            second -=1;
        timeFormatted[2] = second;

        return timeFormatted;
    }
}
