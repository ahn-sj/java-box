package headfirst.designpatternjava;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryTest {

    @Test
    void beanFactoryTest() throws Exception {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        Study study1 = ac.getBean("study", Study.class);
        System.out.println("AnnotationConfigApplicationContext.study = " + study1);

        ac = new ClassPathXmlApplicationContext("config.xml");
        Study study2 = (Study) ac.getBean("animal");
        System.out.println("ClassPathXmlApplicationContext.study = " + study2);
    }

    @Configuration
    static class AppConfig {
        @Bean
        public Study study() {
            return new Study("11001111");
        }
    }

    static class Study {
        private String name;

        public Study(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Study{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
