package com.hardik.hardware.controller;

import com.hardik.hardware.service.AiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class AppController {

    private final AiService aiService;

    public AppController(AiService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/chat")
    public Flux<String> hello(@RequestParam String prompt) {
        return aiService.response(prompt);
    }
}
