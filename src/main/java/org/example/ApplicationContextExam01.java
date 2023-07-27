package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextExam01 {
    public static void main(String[] args) {
        // 공장 정보를 넘긴다
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println("초기화 완료!");

        // 공장에서 정보를 얻어낸다
        UserBean userBean = (UserBean) ac.getBean("userBean");
        userBean.setName("Kang");

        System.out.println(userBean.getName());

        UserBean userBean1 = (UserBean) ac.getBean("userBean");
        if(userBean == userBean1) {
            System.out.println("같은 인스턴스입니다");
        }
    }
}
