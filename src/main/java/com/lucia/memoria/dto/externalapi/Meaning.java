package com.lucia.memoria.dto.externalapi;

import java.util.List;

public record Meaning (String partOfSpeech, List<Definition> definitions){}
