package com.ad;

import com.ad.aspects.SecurityContext;
import com.ad.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value={"com.ad.metier","com.ad.aspects"})
public class Application {
    public static void main(String[] args) {
        SecurityContext .authenticate("root","1234",new String[]{"USER"});
        ApplicationContext context=new AnnotationConfigApplicationContext(Application.class);
        IMetier metier=context.getBean(IMetier.class);
        System.out.println("********************************");
        System.out.println(metier.getClass().getName());
        metier.process();
        System.out.println(metier.compute());
    }
}
