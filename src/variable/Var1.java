package variable; // 지금 단계에서 package는 폴더로 이해하자. Var1이 variable에 들어가있다는 의미.
// 패키지 선언 해줘야 하는데 인텔리제이가 이걸 자동으로 써줌.

// 자바에서 Class 만들때 관례상 첫글자는 무조건 대문자로 한다.
public class Var1 {
    public static void main(String[] args){
        // 10을 20으로 바꾸는 경우가 있다 치면 여기서 3번을 바꿔야함.
        // 이게 100군데를 바꿔야 한다면 답이 없지 => 변수 만들어 쓰자.
        System.out.println(10);
        System.out.println(10);
        System.out.println(10);
    }
}
