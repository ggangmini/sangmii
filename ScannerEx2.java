import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
            System.out.print("두 정수를 입력하세요");
    // 키보드 입력을 받기위한 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
// 키보드로 정수를 입력받을 변수 선언
// int a = 0;
// int b = 0;

//키보드로 정수 입력 받기, 숫자가 아닐 경우 오류 발생
// a=sc.nextint();
// b=sc.netxint() ;
     int a = sc.nextInt();
     int b = sc.nextInt();
     System.out.println(a + "+" +  b + "은" + (a + b));

     sc.close();


    }
}
