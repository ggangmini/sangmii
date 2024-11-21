public class OPpromotionEx {
    public static void main(String[] args) {

    // byte 타입의 변수에 정수 10 저장
        byte bytevalue1= 10;
    // byte 타입의 변수에 정수 20 저장
        byte bytevalue2= 20;
    // 자바에서 정수 연산 시 int 타입으로 자동 타입 변환이 발생함
        //byte bytevalue3 = bytevalue1 + bytevalue2;
    // byte 타입으로 나타내고 싶을때는
    // byte bytevalue3 = (byte)(bytevalue1 + bytevalue2);
    // byte 타입의 정수를 연산 후 int 타입의 변수에 저장
        int intvalue1= bytevalue1 + bytevalue2;
        System.out.println(intvalue1);

    // char 타입의 변수에 문자 A를 저장
        char charvalue1 = 'A';
        // char 타입의 변수에 정수 1을 저장
        char charvalue2 = 1;
//        char charvalue3 = charvalue1 + charvalue2;
    // char charvalue3 = (char)(charvalue1 + charvalue2);
    // char 타입으로 나타내고싶으면 위처럼 사용하면 가능
        int intvalue2 = charvalue1 + charvalue2;
        // 66이 나오기땨문에 이 또한 int사용

        System.out.println(intvalue2);
// int 타입의 변수에 정수10 저장
        int intvalue3 = 10;
// int 타입의 변수에 int타입의 변수와 정수를 연산
// 자바에서 정수끼리 연산 시 int 타입이 됨
        int intvalue4 = intvalue3 / 4;
// 정수타입의 int 타입이라 원래값 2.5에서 소수점을 제외한 2가 출력이 됨
        System.out.println(intvalue4);

// int 타입의 변수에 10 저장
        int intvalue5 = 10;
       // int intvalue6 = (int)(10 / 4.0);
// int 타입의 변수와 실수를 연산 시 더 큰 타입인 실수 타입으로 모두 자동 타입 변환 후 연산 발생, 결과 값도 실수로 출력
        double doublevalue = intvalue5 / 4.0;
// 즉 10.0 / 4.0 이 되어 값은 2.5 (double)타입 이기에 가능
        System.out.println(doublevalue);

    }
}
