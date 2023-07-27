package spring.study1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import spring.study1.service.MemberService;

@Controller // 스프링 컨테이너가 뜰 때 MemberController를 생성하고 관리 해줌
public class MemberController {
    private final MemberService memberService;

    // MemberController를 생성할 때 호출
    @Autowired // spring이 memberService를 스프링 컨테이너에 있는 memberService를 가져다 연결시켜줌(의존관계 주입)
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}