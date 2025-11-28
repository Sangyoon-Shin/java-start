package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        int a = 0;
        a = a + 1;
        System.out.println(a); // 1

        a = a + 1;
        System.out.println(a); // 2

        a += 1;
        System.out.println(a); // 3

        a++; // 후위 증감 연산자.
        System.out.println(a); // 4

        ++a; // 전위 증감 연산자.
        System.out.println(a); // 5

    }
}
