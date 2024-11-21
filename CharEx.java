public class CharEx {
    public static void main(String[] args) {

        char c1 = 'A'; // char 타입의 변수 c1에 문자를 직접입력
        char c2 = 65; // char 타입의 변수 c2에 10진수 입력
        char c3 = '\u0041'; // char 타입 변수 c3에 16진수 입력 (아스키코드 확인하기)

        char c4 = '가'; // char 타입의 변수 c4에 문자를 직접 입력
        char c5 = 44032; // char 타입의 변수 c5에 10진수 입력
        char c6 = '\uac00'; // char 타입의 변수 c6에 16진수 입력

        // 정수 타입의 기본 데이터 타입인 int 타입에 char 형 데이터를 저장, 출력되는 결과가 정수로 출력

        int uniCode = c1; // 유니코드 값 얻기

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(uniCode);


    }
}
