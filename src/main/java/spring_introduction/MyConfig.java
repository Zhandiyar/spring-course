package spring_introduction;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("spring_introduction")
public class MyConfig {

    @Bean
    public Pet catBean(){
        return  new Cat();
    }

    @Bean
    @Scope("prototype")
    public Person personBean (){
        return  new Person(catBean());
    }

}
