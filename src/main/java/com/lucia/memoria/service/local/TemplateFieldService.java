package com.lucia.memoria.service.local;

import com.lucia.memoria.model.TemplateField;
import com.lucia.memoria.repository.TemplateFieldRepository;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class TemplateFieldService {

  private final TemplateFieldRepository templateFieldRepository;


  public TemplateFieldService(TemplateFieldRepository templateFieldRepository) {
    this.templateFieldRepository = templateFieldRepository;
  }

  public TemplateField findTemplateFieldById(UUID templateFieldId) {
    return templateFieldRepository.findByTemplateFieldId(templateFieldId)
        .orElseThrow(() -> new IllegalArgumentException("Target template field does not exists"));
  }


}
