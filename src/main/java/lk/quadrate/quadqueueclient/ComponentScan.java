package lk.quadrate.quadqueueclient;

import lk.quadrate.quadqueueclient.configuration.PropertiesConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Slf4j
@Configuration
@EnableAutoConfiguration
@org.springframework.context.annotation.ComponentScan
@PropertySource(value = "classpath:quad-client-prop.yml",factory = PropertiesConfig.class)
public class ComponentScan {

}
