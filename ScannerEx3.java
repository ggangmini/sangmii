import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        System.out.print("몇 층인지 입력하세요");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(a*5 + "m" + "입니다");
        sc.close();
    }
}
