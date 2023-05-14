package tn.spring.springproject.Config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class AspectLog {
    @After("execution(* tn.spring.springproject.service.*.get*(..))")
    void getStatique() { log.info("Bon courage :"); }
    @Before("execution(* tn.spring.springproject.service.*.*(..))")
    void journal(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        log.info("Avant le service nommé :"+name);
    }
}
