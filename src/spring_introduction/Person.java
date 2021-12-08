package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("dogBean")
    private Pet pet;
    private String surname;
    private int age;

//    @Autowired
    public Person(Pet pet){
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public Person(){
        System.out.println("Person bean is created");
    }

    public void callYourPet(){
        System.out.println("Животне!");
        pet.say();
    }


    public void setPet(Pet pet ) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }


//    @Value("${person.surname}")
    public void setSurname(String surname) {
        System.out.println("Class surname: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

//    @Value("${person.age}")
    public void setAge(int age) {
        System.out.println("Class age: set age");
        this.age = age;
    }
}
