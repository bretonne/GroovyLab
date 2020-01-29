package main;

public class Line {
    public static String Tickets(int[] peopleInLine)
    {
        Bills bills = new Bills();
        for (int billToReceive : peopleInLine)
        {
            bills.receive(billToReceive);

            int changeToGiveBack = billToReceive - 25;
            if (!bills.giveChangeIfNeeded(changeToGiveBack))
                return "NO";
        }
        return "YES";
    }




    private static class Bills {
        int bills25=0;
        int bills50=0;
        int bills100=0;

        public void receive(int money) {
            switch (money) {
                case 25:
                    bills25++; break;
                case 50:
                    bills50++; break;
                case 100:
                    bills100++; break;
                default:
                    System.out.println("Unknown bill received: "+ money);
            }
        }

        public boolean giveChangeIfNeeded(int money) {
            switch (money) {
                case 0:
                    return true;
                case 25:
                    if (bills25>0 ) {
                        bills25--;
                        return true;
                    }
                    else
                        return false;
                case 50:
                    if (bills50>0) {
                        bills50--;
                        return true;
                    }
                    else if (bills25>=2) {
                        bills25 -= 2;
                        return true;
                    }
                    else
                        return false;
                case 75:
                    if (bills50>=1 && bills25>=1) {
                        bills25 --;
                        bills50 --;
                        return true;
                    }
                    else if (bills25>=3) {
                        bills25 -= 3;
                        return true;
                    }
                    return false;
                default:
                    System.out.println("Unknown change amount required: "+ money);
            }

            return false;
        }
    }
}