package hibernete_many_to_many;

import hibernete_many_to_many.entity.Child;
import hibernete_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = factory.getCurrentSession();

            Section section1 = new Section("Football");
            Child child1 = new Child("Zaur", 5);
            Child child2 = new Child("Masha", 7);
            Child child3 = new Child("Vasya", 6);

            session.beginTransaction();
            session.save(section1);

            section1.addChildToSection(child3);
            section1.addChildToSection(child2);
            section1.addChildToSection(child1);

            session.save(child1);
            session.save(child2);
            session.save(child3);
            
            session.getTransaction().commit();
            System.out.println("Done!!!");
//            session = factory.getCurrentSession();
//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//            Child child1 = new Child("Igor", 10);
//            child1.addChildToSection(section1);
//            child1.addChildToSection(section2);
//            child1.addChildToSection(section3);

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Child child = session.get(Child.class, 2);
//
//            System.out.println(child.getSections());
//            session.save(child);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");

        }
        finally {
            session.close();
            factory.close();

        }

    }
}
