package lk.quadrate.quadqueueclient.connection;

import org.springframework.lang.Nullable;

public interface ConnectionFactory {

    Connection createConnection();

}
