public class CastingEx {
    public static void main(String[] args) {
        int intvalue = 44032;
    // char 타입의 변수에 int 타입의 변수를 저장 (char은 문자 타입!!!!!)
    // int 타입이 char 타입보다 크기가 크기 때문에 강제 타입 변환이 필요
        char charvalue = (char)intvalue;
        System.out.println(charvalue);

        long longvalue = 500;
        // int 타입의 변수에 long 타입의 변수를 저장
        // long 타입이 int 타입보다 크기가 크기 때문에 강제 타입 변환이 필요
        intvalue = (int)longvalue;
        System.out.println(intvalue);

        // int 타입의 변수에 double 타입의 변수를 저장
        // double 타입이 int 타입보다 크기가 크기 때문에 강제 타입 변환이 필요
        double doublevalue = 3.14; //double 타입은 실수를 표현해 소수점 까지 가능하지만 int는 안됨
        intvalue = (int)doublevalue; //3.14에서 3으로 값이 나와 데이터 손실이 발생함.
        System.out.println(intvalue);



    }
}
