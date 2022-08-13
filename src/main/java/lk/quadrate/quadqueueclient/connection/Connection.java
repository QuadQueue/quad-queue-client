package lk.quadrate.quadqueueclient.connection;

import java.net.InetAddress;

public interface Connection {

    String getHost();
    int getPost();
    String getUsername();
    String getPassword();
}
