package edu.escuelait.tienda.configurations;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@ConfigurationProperties(prefix = "app")
@PropertySource(value = "classpath:effects.properties")
public class TiendaParametters {

    private String gift;
    private String notifications;
    private String reports;

}
