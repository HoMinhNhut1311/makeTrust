package com.example.makeTrust.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GameInfoDtoRequest {

    String gameCode;
    String gameName;
    String gameDes;
}
