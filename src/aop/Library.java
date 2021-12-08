package aop;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component("libBean")
public class Library {

    public void getBook() {
//        System.out.println("Bean libBean has created");
        System.out.println("Мы взяли книгу");
    }
}
