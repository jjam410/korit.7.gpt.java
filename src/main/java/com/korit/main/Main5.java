package com.korit.main;

@FunctionalInterface
interface 무기 {
    String 공격(Integer 데미지);
    // void 위협() - 추상메서드 1개 더 추가시 에러 발생
}

class 총 implements 무기 {
    @Override
    public String 공격(Integer 데미지) {
        System.out.println("데미지: " + 데미지);
        System.out.println("총을 쏜다");
        return "총 데미지: " + 데미지;
    }
}

public class Main5 {
    public static void main(String[] args) {
        무기 wp1 = new 총();
        wp1.공격(100);

        무기 wp2 = new 무기() {
            @Override
            public String 공격(Integer 데미지) {
                System.out.println("데미지: " + 데미지);
                System.out.println("내가 만든 무기로 공격");
                return "커스텀 무기 데미지: " + 데미지;
            }
        };
        wp2.공격(50);

        무기 wp3 = (Integer 데미지) -> {
            System.out.println("람다로 만든 무기로 공격");
            System.out.println("데미지: " + 데미지);
            return "람다 무기 데미지: " + 데미지;
        };
        wp3.공격(1000);

        //
        무기 wp4 = (Integer 데미지) -> {
            System.out.println("람다로 만든 무기로 공격");
            System.out.println("데미지: " + 데미지);
            return "람다 무기 데미지: " + 데미지;
        };
        wp4.공격(100);

        //
        무기 wp5 = (Integer 데미지) -> {
            System.out.println("람다로 만든 무기로 공격");
            System.out.println("데미지: " + 데미지);
            return "람다 무기 데미지: " + 데미지;
        };
        wp5.공격(200);

        // 리턴 값이 있는 경우 중괄호{}를 생략하고 바로 리던 캆을 입력하면 된다.
        무기 wp6 = 데미지 -> "람다 무기 데미지: " + 데미지;

        wp6.공격(100);
    }
}
