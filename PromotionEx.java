public class PromotionEx {
    public static void main(String[] args) {

        byte byteValue = 10; // byte 타입의 변수에 정수 10저장
        int intvalue = byteValue; // int 타입의 변수에 byte타입의 변수 저장
        System.out.println(intvalue);

        char charValue = '가'; //char 타입의 변수에 문자 '가' 저장
        // 자동 타입 변환 발생
        // 변수는 한번 선언 시 계속 재활용 가능
        // 변수는 같은 범위 안에서 같은 이름으로 재선언 불가
        intvalue = charValue; // int 타입의 변수에 char 타입의 변수 저장
        System.out.println("가의 유니코드 값 : intValue");

        intvalue = 500; // int 타입의 변수에 정수 500저장
        // long 타입의 변수에 int 타입의 변수 저장
        long longvalue = intvalue;
        System.out.println(longvalue);

        intvalue = 200;
         // double 타입의 변수에 int 타입의 정수 저장
        double doubleValue = intvalue;
        System.out.println(doubleValue);

    }
}
