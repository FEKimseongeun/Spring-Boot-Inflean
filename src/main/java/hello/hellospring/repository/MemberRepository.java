package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //저장하기
    Optional<Member> findById(Long id); //저장된 것들 중에서 id로 찾기
    Optional<Member> findByName(String name); //저장된 것들 중에서 이름으로 찾기
    List<Member> findAll(); // 모든 정보 다 찾기
}
