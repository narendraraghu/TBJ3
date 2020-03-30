package Daily_Problem.DP30032020;

/*Given an integer, find the number of 1 bits it has
Here's an example and some starting code.
# 4
# 23 = 10111
*/
public class Solution {
    public static void main(String[] args) {
        int number = 23;
        System.out.println(getNumberOfOne(number));
    }

    private static int getNumberOfOne(int n) {
        int count = 0;
        int a;
        int x = 0;
        while (n > 0) {
            a = n % 2;
            if (a == 1) {
                count++;
            }
            n = n / 2;
        }
        return count;
    }
}
