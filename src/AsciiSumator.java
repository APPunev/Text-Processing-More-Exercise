import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();

        //.
        //@
        //dsg12gr5653feee5

        char start = first.charAt(0);
        char end = second.charAt(0);
        char[] input = third.toCharArray();

        int sum = 0;

        for (char c:input) {
            if ((int)c > (int)start && (int)c < (int)end) {
                sum += c;
            }
        }
        System.out.println(sum);
    }
}
