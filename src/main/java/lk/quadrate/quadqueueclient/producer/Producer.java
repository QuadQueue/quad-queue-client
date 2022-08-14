package lk.quadrate.quadqueueclient.producer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "quad-queue",url = "${quad-queue.producer.configuration.url}")
public interface Producer {

    @PostMapping("${quad-queue.producer.configuration.produce-url}")
    public void sendPayload(@RequestBody String s);
}
