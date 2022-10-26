package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence=0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence); //id값 세팅
        store.put(member.getId(), member); // 스토어에 저장
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id)); //null일 경우에 방지
    }

    @Override
    public Optional<Member> findByName(String name) {
        //
        return store.values().stream()
                .filter(member -> member.getName().equals(name)) // 내가 받은 name이 파라미터로 받은 name과 같은지를 필터링
                .findAny(); // 하나라도 찾으면 반환
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values()); // 저장되어 있는 데이터  값 모두 반환
    }

    public void clearStore(){
        store.clear();
    }
}
