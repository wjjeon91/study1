package spring.study1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.study1.domain.Member;

import java.util.Optional;

// Spring Data JPA가 SpringDataJpaMemberRepository를 Spring Bean으로 자동 등록
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    @Override
    Optional<Member> findByName(String name);
}