package com.lucia.memoria.dto.local;

import com.lucia.memoria.helper.AccessLevel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeckMinimalDTO {

  private UUID deckId;
  @NotBlank
  private String name;
  private AccessLevel accessLevel;
  private String path;
  @NotNull
  private UUID userId;
}
