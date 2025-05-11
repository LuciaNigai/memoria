package com.lucia.memoria.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExternalAPIConfig {
    @Value("${FREE_DICTIONARY_API}")
    private  String freeDictionaryUrl;

    public String getFreeDictionaryUrl() {
        return freeDictionaryUrl;
    }
}
