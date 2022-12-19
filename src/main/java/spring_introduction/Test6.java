package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.AnnotatedParameterizedType;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet cat1 = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);



        Person person1 = context.getBean("personBean", Person.class);
        System.out.println(person1.getAge());
        System.out.println(person1.getSurname());
        //        Person person2 = context.getBean("personBean", Person.class);

//        person.callYourPet();


        context.close();
    }
}
