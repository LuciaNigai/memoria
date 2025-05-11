package com.lucia.memoria.dto.externalapi;

import java.util.List;

public record Response (String word, String phonetic, List<Meaning> meanings){}

