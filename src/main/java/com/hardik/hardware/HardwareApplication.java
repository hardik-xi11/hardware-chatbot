package com.hardik.hardware;

import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HardwareApplication {

    private final EmbeddingModel embeddingModel;

    @Autowired
    public HardwareApplication(EmbeddingModel embeddingModel) {
        this.embeddingModel = embeddingModel;
    }


    public static void main(String[] args) {
        SpringApplication.run(HardwareApplication.class, args);
    }

}
