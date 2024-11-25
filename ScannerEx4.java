import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        System.out.print("x 값을 입력하세요");

        Scanner sc = new Scanner(System.in);
// 입력받은 데이터를 저장할 변수
        // int input = 0;

        //input =sc.nextlnt();
        int x = sc.nextInt();
        // y 값을 얻기 위한 연산식, 기본 자바 연산자에 제곱연산자가 없음, 제곱
        // 연산을 위해서 입력받은 값 * 입력받은 값으로 처리
        // int y = input * input -3*input +7;
        int y = x * x - 3 * x + 7;

        System.out.print("x=" + x + ", y=" + y);
        sc.close();
    }
}
