package lk.quadrate.quadqueueclient;

import lk.quadrate.quadqueueclient.configuration.PropertiesConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Slf4j
@Configuration
@EnableAutoConfiguration
@EnableFeignClients(basePackages = "lk.quadrate.quadqueueclient")
@org.springframework.context.annotation.ComponentScan(basePackages = "lk.quadrate")
@PropertySource(value = "classpath:quad-client-prop.yml",factory = PropertiesConfig.class)
public class QuadClient {

}
