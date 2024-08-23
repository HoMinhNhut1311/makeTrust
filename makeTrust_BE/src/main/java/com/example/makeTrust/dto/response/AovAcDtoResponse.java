package com.example.makeTrust.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AovAcDtoResponse {

    String accountId;
    Double price;
    Integer hero;
    Integer skin;

}
