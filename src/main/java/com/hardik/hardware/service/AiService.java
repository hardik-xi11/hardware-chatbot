package com.hardik.hardware.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class AiService {

    private final ChatClient chatClient;

    public AiService(ChatClient.Builder chatClient) {
        this.chatClient = chatClient
                .defaultSystem("you are an expert on hardware components required for hardware projects")
                .build();
    }

    public Flux<String> response(String message) {
        return chatClient.prompt()
                .user(message)
                .stream()
                .content();
    }
}
