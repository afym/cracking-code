package cracking.solution02;

public class WeirdNumbers {
    /*
     *  > The elements of the input (N) is integer only and  1 <= N <= 100
     *  > If N is odd then print "Weird"
     *  > If N is even and, in between range 2 and 5(inclusive), print "Not Weird"
     *  > If N is even and, in between range 6 and 20(inclusive), print "Weird"
     *  > If N is even and , print "Not Weird"
     *
     *  input : 3 output : Weird
     *  input : 24 output : Not Weird
     */
    public static String output(int input) {
        if (isOdd(input)) {
            return "Weird";
        }

        if ((input >= 2 && input <= 5) && !isOdd(input)) {
            return "Not Weird";
        }

        if ((input >= 6 && input <= 20) && !isOdd(input)) {
            return "Weird";
        }

        return "Not Weird";
    }

    private static boolean isOdd(int input)
    {
        if (input % 2 > 0) {
            return true;
        }

        return false;
    }
}