import java.util.Arrays;

public class GreatestCommonFactor {

  public static int gcd(int[] nums) {
    int a = 0;
    int lcm;

    int n1 = nums[0];
    int n2;
    for (int j = 1; j < nums.length; j++) {
      n2 = nums[j];

      int div = 1;

      while (true) {
        if (div % n1 == 0 && div % n2 == 0) {
          lcm = div;
          // System.out.println("lcm " + lcm);
          break;
        }
        ++div;
      }
      // gcd of first 2 num
      a = (n1 * n2) / lcm;

      n1 = a;
      // System.out.println(a);

    }

    return a;

  }

  public static void main(String[] args) {
    int[] num = { 84, 70, 42, 56 };
    int[] num2 = { 19, 38, 76, 133, 95 };
    int[] num3 = { 120, 105, 300, 95, 425, 625, 18 };

    System.out.println("GCD of " + Arrays.toString(num) + " is " + gcd(num));
    System.out.println("GCD of " + Arrays.toString(num2) + " is " + gcd(num2));
    System.out.println("GCD of " + Arrays.toString(num3) + " is " + gcd(num3));

  }

}
