package aop;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    @Override
    public void getBook() {
//        System.out.println("Bean libBean has created");
        System.out.println("Мы взяли книгу из UniLibrary");
    }

    public void returnBook(){
        System.out.println("Мы возвращаем книгу из UniLibrary");
    }

    public void getMagazine() {
//        System.out.println("Bean libBean has created");
        System.out.println("Мы взяли журнал из UniLibrary");
    }
}
