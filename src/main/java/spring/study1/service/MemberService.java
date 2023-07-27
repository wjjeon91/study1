package spring.study1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.study1.domain.Member;
import spring.study1.repository.MemberRepository;

import java.util.List;
import java.util.Optional;

//@Service    // spring이 스프링 컨테이너에 MemberService를 등록해줌
public class MemberService {

    private final MemberRepository memberRepository;

    //@Autowired  // spring이 MemberRepository를 스프링 컨테이너에 있는 MemberRepository를 가져다 연결시켜줌
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    /**
     * 회원가입
     */
    public Long join(Member member){
        //같은 이름이 있는 중복 회원 X
        validateDuplicateMember(member);

        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {           // extract method 단춗키  ctrl + alt + m
        memberRepository.findByName(member.getName())               //return 단축키 ctrl + alt + v
                .ifPresent(m->{
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    /**
     * 전체 회원 조회
     */
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }
}
