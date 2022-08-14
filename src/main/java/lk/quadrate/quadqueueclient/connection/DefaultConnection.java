package lk.quadrate.quadqueueclient.connection;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
@Slf4j
@Configuration
public class DefaultConnection implements ConnectionFactory{

    @Autowired
    @Qualifier("simpleQuadConnection")
    private Connection connection;

    @Override
    public Connection createConnection() {
        log.info("Default QuadQueue Connection - {}",connection);
        return connection;
    }
}
