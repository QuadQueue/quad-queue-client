package lk.quadrate.quadqueueclient.connection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleConnectionProperty implements ConnectionPropertyProvider{

    @Value("${quad-queue.server.configuration.host}")
    private String host;
    @Value("${quad-queue.server.configuration.port}")
    private int port;
    @Value("${quad-queue.server.configuration.username}")
    private String username;
    @Value("${quad-queue.server.configuration.password}")
    private String password;

    @Override
    public String getHost() {
        return host;
    }

    @Override
    public int getPort() {
        return port;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
