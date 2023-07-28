package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example") // 컴포넌트를 스캔할 때 클래스명의 첫글자를 소문자로 가져옵니다
public class ApplicationConfig2 {

}
