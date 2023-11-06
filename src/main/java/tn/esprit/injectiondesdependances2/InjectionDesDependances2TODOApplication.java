package tn.esprit.injectiondesdependances2;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tn.esprit.injectiondesdependances2.controller.ToDoController;

@Configuration
@ComponentScan
public class InjectionDesDependances2TODOApplication {


    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(
                             InjectionDesDependances2TODOApplication.class)) {

            ToDoController toDoController =
                    applicationContext.getBean(ToDoController.class);
            System.out.println(toDoController.getCoursesList());
        }
    }
}
