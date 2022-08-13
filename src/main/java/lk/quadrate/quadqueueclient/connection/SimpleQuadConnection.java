package lk.quadrate.quadqueueclient.connection;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleQuadConnection implements Connection{
    @Override
    public String getHost() {
        return null;
    }

    @Override
    public int getPost() {
        return 0;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }
}
