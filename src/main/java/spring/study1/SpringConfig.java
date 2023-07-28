package spring.study1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.study1.repository.*;
import spring.study1.service.MemberService;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    /* JDBC 쓸때 사용
    private DataSource dataSource;
    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }
     */

    /* JPA 쓸떄 사용
    private final EntityManager em;

    public SpringConfig(EntityManager em) {
        this.em = em;
    }
     */

    /* Spring Data JPA 쓸떄 */
    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // Spring bean에 MemberService 등록
    @Bean
    public MemberService MemberService() {        // Spring bean에 등록되어 있는 MemberRepository를 MemberService에 넣어줌
//        return new MemberService(memberRepository());
        return new MemberService(memberRepository); //Spring Data JPA 쓸떄 사용
    }

    /* Spring Data JPA 사용하기위해 주석처리
    // Spring bean에 MemberRepository 등록
    @Bean
    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//        return new JdbcMemberRepository(dataSource);
//        return new JdbcTemplateMemberRepository(dataSource);
        return new JpaMemberRepository(em);
    }
     */
}