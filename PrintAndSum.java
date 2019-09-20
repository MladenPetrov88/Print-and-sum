import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = scanner.nextInt();
        int endNumber = scanner.nextInt();
        int sum = 0;

        for (int i = startNumber; i <= endNumber ; i++) {
            sum += i;
            System.out.printf("%d ",i);
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
