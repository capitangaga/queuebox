package ru.capitangaga.queuebox;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import ru.capitangaga.queuebox.admin.AdminController;

@Configuration
public class WebContextConfiguration {

    @Bean
    public String appName() {
        return "Queuebox";
    }
}
