package operator;

public class Operator2 {
    public static void main(String[] args){
        // 문자열과 문자열 더하기1
        String result1 = "hello " + "world"; // 문자열 다루는건 파이썬이랑 똑같은 듯. 자료형은 String
        System.out.println(result1);

        // 문자열과 문자열 더하기2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열과 숫자 더하기1
        String result3 = "a + b = " + 10; // 문자랑 더하는 다른 대상(숫자)을 자동으로 문자로 변환해줌
        System.out.println(result3);

        // 문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
    }
}
