package br.com.brunomilitzer.trainings.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import( DAOConfig.class )
public class SpringConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Service service() {
        return new Service();
    }
}
