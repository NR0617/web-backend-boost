package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextExam04 {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig2.class);

        Car car = ac.getBean(Car.class); // 타입이 Car인 클래스명을 가져온다 - 오타가 발생할 위험이 사라진다
        car.run();
    }

}
