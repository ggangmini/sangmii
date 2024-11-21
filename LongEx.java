public class LongEx {

    public static void main(String[] args) {
        // long 타입은 int 타입보다 더 큰 숫자를 저장할 수 있는 데이터 타입
// long 타입의 정수 리터럴에는 값 뒤에 반드시 L(소문자도 가능)을 입력해야 함
        long var1 = 10; // long 타입의 변수에 int타입의 정수 10 저장 
        long var2 = 10L; // long 타입의 변수에 long타입의 정수 10 저장
        // long 타입의 변수에 int 타입의 정수를 100억 을 저장
        // 출력이 안되는 이유: java의 정수 기본타입은 int타입이고,
        // int 타입은 최대 -21억~21억까지인데 100억의 숫자를 int타입으로 표현하여 오류발생
        long var3 = 10000000000L;
    // long 타입은 10의 64승까지 표현이 가능하여 L을 붙이면 값 출력가능하다.
    //    값을 낼려면 long타입의 정수로 하면 저장가능
        long var4 = 10000000000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);

    }
}
