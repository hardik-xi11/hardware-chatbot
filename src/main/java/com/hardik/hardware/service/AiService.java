package com.hardik.hardware.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.vectorstore.QuestionAnswerAdvisor;
import org.springframework.ai.vectorstore.pgvector.PgVectorStore;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class AiService {

    private final ChatClient chatClient;

    public AiService(ChatClient.Builder chatClient, PgVectorStore vectorStore) {
        this.chatClient = chatClient
                .defaultAdvisors(QuestionAnswerAdvisor.builder(vectorStore).build())
                .defaultSystem("you are an expert on hardware components required for hardware projects. List out all the components necessary to build the project and the software/libraries required for programming the device and handling the sensor data.")
                .build();
    }

    public Flux<String> response(String message) {
        return chatClient.prompt()
                .user(message)
                .stream()
                .content();
    }
}
