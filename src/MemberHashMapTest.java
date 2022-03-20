import java.util.HashMap;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member member1 = new Member(1001, "이태성");
        Member member2 = new Member(1002, "이정민");
        Member member3 = new Member(1005, "정기윤");
        Member member4 = new Member(1005, "박주희");

        // 회원 추가
        memberHashMap.addMember(member1);
        memberHashMap.addMember(member2);
        memberHashMap.addMember(member3);
        memberHashMap.addMember(member4);

        memberHashMap.showAllMember();

        // addMember() 메서드로 회원 추가를 했을 때 member3과 member4의 memberId가 같기 때문에 member4는 회원 추가가 되지 않는다.

        // 결과
        // 이태성 회원님의 아이디는 1001입니다.
        // 이정민 회원님의 아이디는 1002입니다.
        // 정기윤 회원님의 아이디는 1005입니다.

        // 회원 삭제
        memberHashMap.removeMember(1001);

        memberHashMap.showAllMember();

        // 결과
        // 이정민 회원님의 아이디는 1002입니다.
        // 박주희 회원님의 아이디는 1005입니다.

        // HashMap의 toString
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Kim");
        hashMap.put(2, "Lee");
        hashMap.put(3, "Park");

        System.out.println(hashMap);

        // 결과
        // {1=Kim, 2=Lee, 3=Park}
    }
}
