package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("dogBean")
public class Dog implements Pet{

    public Dog() {
        System.out.println("Dog bean is created");
    }
    @Override
    public void say(){
        System.out.println("bow-wow");
    }

    public void init(){
        System.out.println("Class dog: init method");
    }


    public void destroy(){
        System.out.println("Class dog: destroy method");
    }
}
