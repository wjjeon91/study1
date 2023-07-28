package spring.study1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.study1.repository.JdbcMemberRepository;
import spring.study1.repository.JdbcTemplateMemberRepository;
import spring.study1.repository.MemberRepository;
import spring.study1.repository.MemoryMemberRepository;
import spring.study1.service.MemberService;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private DataSource dataSource;
    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // Spring bean에 MemberService 등록
    @Bean
    public MemberService MemberService() {
        // Spring bean에 등록되어 있는 MemberRepository를 MemberService에 넣어줌
        return new MemberService(memberRepository());
    }

    // Spring bean에 MemberRepository 등록
    @Bean
    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//        return new JdbcMemberRepository(dataSource);
        return new JdbcTemplateMemberRepository(dataSource);
    }
}