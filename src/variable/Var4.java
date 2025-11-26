package variable;

public class Var4 {
    public static void main(String[] args) {
        // 1. 변수 선언, 초기화 따로
        int a;
        a = 1;
        System.out.println(a);

        // 2. 변수 선언, 초기화 동시에
        int b = 2;
        System.out.println(b);

        // 3. 여러 변수 선언, 초기화 동시에
        int c = 3, d = 4;
        System.out.println(c);
        System.out.println(d);

        // 주의! 변수 선언하고 초기화하지 않은 변수 읽으면 컴파일 에러 뜬다.
    }
}
