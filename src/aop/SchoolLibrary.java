package aop;

import aop.AbstractLibrary;
import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Мы взяли книгу из SchoolLibrary");
    }
}
