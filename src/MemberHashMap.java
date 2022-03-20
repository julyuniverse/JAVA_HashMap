import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    // 멤버 변수
    private HashMap<Integer, Member> hashMap; // HashMap 클래스는 제네릭 클래스라는 걸 알 수 있다.

    // 생성자
    public MemberHashMap() {
        hashMap = new HashMap<>();
    }

    // 회원 추가
    public void addMember(Member member) {
        hashMap.put(member.getMemberId(), member);
    }

    // 회원 삭제
    public boolean removeMember(int memberId) {
        if(hashMap.containsKey(memberId)) { // containsKey() 메서드는 해당 hash map에 key가 있는지 확인
            hashMap.remove(memberId);
            return true;
        }

        // ontainsKey() 메서드를 통해서 key가 없다면 return false;
        System.out.println("The key does not exist.");
        return false;
    }

    // 모든 회원 출력
    public void showAllMember() {
        Iterator<Integer> ir = hashMap.keySet().iterator(); // keySet() 메서드를 통해서 모든 key들 가져온다.
        while(ir.hasNext()) {
            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }

        System.out.println();
    }
}
