package spring.study1.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import spring.study1.domain.Member;
import spring.study1.repository.MemberRepository;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@Transactional
class MemberServiceIntegrationTest {

    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @Test
    void 회원가입() {
        // given
        Member member = new Member(); // member 객체 생성
        member.setName("spring"); // member name에 hello을 넣음

        // when
        Long saveId = memberService.join(member); // member 객체를 회원가입하고, 반환된 id를 saveId

        // then
        // 회원가입한 member의 id가 저장소에 있으면, 해당 member를 findMember 로
        Member findMember = memberService.findOne(saveId).get();
        // 회원가입한 member와, 저장소에서 가져온 member의 이름이 같은 지 검증
        Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    public void 중복_회원_예외() {
        // given
        // 이름이 같은 중복 회원 member 객체 생성
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        // when
        memberService.join(member1);
        // memberService.join(member2)에 IllegalStateException 예외 검증
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
        System.out.println(e.getMessage());
    }
}