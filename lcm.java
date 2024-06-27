import java.util.Scanner;
public class LCMCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        long max, step, lcm;
        if (num1 > num2)
            max = step = num1;
        else
            max = step = num2;
        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                lcm = max;
                break;
            }
            max += step;
        }
        System.out.println(lcm);
    }
}
