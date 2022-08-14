package lk.quadrate.quadqueueclient.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SimpleQuadConnection implements Connection{


    @Autowired
    @Qualifier("simpleConnectionProperty")
    private ConnectionPropertyProvider propertyProvider;
    @Override
    public String getHost() {
        return propertyProvider.getHost();
    }

    @Override
    public int getPost() {
        return propertyProvider.getPort();
    }

    @Override
    public String getUsername() {
        return propertyProvider.getUsername();
    }

    @Override
    public String getPassword() {
        return propertyProvider.getPassword();
    }
}
