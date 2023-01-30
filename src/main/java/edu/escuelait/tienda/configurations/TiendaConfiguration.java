package edu.escuelait.tienda.configurations;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "tienda")
public class TiendaConfiguration {

    private String name;
    private String description;
    private String version;
    private String language;

}
