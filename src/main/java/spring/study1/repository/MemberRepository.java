package spring.study1.repository;

import spring.study1.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);     //Optional을 사용하면 null로 반환되지 않는다.
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
