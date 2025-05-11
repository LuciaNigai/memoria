package com.lucia.memoria.controller;

import com.lucia.memoria.dto.externalapi.Response;
import com.lucia.memoria.service.ExternalAPIService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/meaning")
public class ExternalAPIController {
    private final ExternalAPIService externalAPIService;

    public ExternalAPIController(ExternalAPIService externalAPIService) {
        this.externalAPIService = externalAPIService;
    }

    @GetMapping("/{word}")
    public Mono<ResponseEntity<List<Response>>> searchForWord(@PathVariable String word) {
        return externalAPIService.callExternalApi(word)
                .map(ResponseEntity::ok);
    }
}
