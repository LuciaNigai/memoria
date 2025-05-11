package com.lucia.memoria.service;

import com.lucia.memoria.config.ExternalAPIConfig;
import com.lucia.memoria.dto.externalapi.Response;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class ExternalAPIService {
    private final WebClient webClient;

    public ExternalAPIService(WebClient.Builder webClientBuilder, ExternalAPIConfig externalAPIConfig) {
        this.webClient = webClientBuilder.baseUrl(externalAPIConfig.getFreeDictionaryUrl()).build();
    }

    public Mono<List<Response>> callExternalApi(String word) {
        return webClient.get()
                .uri("/{word}", word)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Response>>() {});
    }
}
