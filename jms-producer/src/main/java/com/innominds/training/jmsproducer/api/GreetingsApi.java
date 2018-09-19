package com.innominds.training.jmsproducer.api;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/greetings")
@RestController
public class GreetingsApi {
    @Value("${innominds.queue.greetings}")
    private String greetingsDestinationQueue;

    private final JmsTemplate jmsTemplate;

    public GreetingsApi(final JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @PostMapping
    public ResponseEntity<Void> postGreeting(@RequestBody Map<String, String> payload) {

        final StringBuilder builder = new StringBuilder();
        for (final Map.Entry<String, String> entry : payload.entrySet()) {
            builder.append(entry.getKey() + " = " + entry.getValue())
                    .append("\n");
        }

        jmsTemplate.send(greetingsDestinationQueue, (session) -> session.createObjectMessage(builder.toString()));

        return ResponseEntity.ok().build();
    }
}
