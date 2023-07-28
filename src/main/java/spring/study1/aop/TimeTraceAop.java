package spring.study1.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component  //이렇게 쓸수도 있지만 spring bean에 등록하는 걸 선호함
public class TimeTraceAop {

    @Around("execution(* spring.study1..*(..))") // AOP를 사용할 위치(spring.study1 하위 모든 메서드)
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis(); // 시작 시간 측정
        System.out.println("START: " + joinPoint.toString());
        try {
            return joinPoint.proceed(); // 다음 메서드로 진행
        } finally {
            long finish = System.currentTimeMillis(); // 종료 시간 측정
            long timeMs = finish - start; // 소요 시간 측정

            System.out.println("END: " + joinPoint.toString() + " " + timeMs + "ms");
        }
    }
}