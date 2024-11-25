import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        System.out.print("x 값을 입력하세요");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = x * x - 3 * x + 7;

        System.out.print("x=" + x + ", y=" + y);
        sc.close();
    }
}
