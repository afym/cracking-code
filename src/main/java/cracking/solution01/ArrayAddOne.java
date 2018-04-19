package cracking.solution01;

public class ArrayAddOne {
    /*
     *  > The elements of the input array is between 0 and 9 only
     *  > You must add a unit to the array as a simple number
     *
     *  input : [1,2,3] output : [1,2,4]
     *  input : [1,9,9] output : [2,0,0]
     *  input : [1,0,1] output : [1,0,2]
     *  input : [9,9,9] output : [1,0,0,0]
     */
    public static int[] output(int[] input) {
        int carry = 1;
        int last = input.length - 1;
        int loop = last;

        while (loop >= 0) {
            int current = input[loop] + carry;
            if (current < 10) {
                input[loop] = current;
                break;
            }

            if (loop == 0 && input[loop] < 8) {
                carry += input[loop];
                break;
            }

            input[loop] = 0;
            loop -= 1;
        }

        if (loop < 0) {
            int[] nextInput = new int[(input.length + 1)];
            nextInput[0] = carry;
            return nextInput;
        }

        return input;
    }
}
