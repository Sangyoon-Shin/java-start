package operator;

import com.sun.security.jgss.GSSUtil;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 문자열 + 정수하면 문자열로 이어져서 나옴

        // ctrl + shift + f10 => 바로 실행 단축키
        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println(("a * b = " + multi));

        // 나눗셈
        int div = a / b;
        System.out.println("a / b = " + div); // 5 / 2 = 2.5인데 int 형이니까 소수점 표현 X. 뒤에 형변환에서 자세히

        // 나머지
        int mod = a % b;
        System.out.println(("a % b = " + mod));

    }
}
