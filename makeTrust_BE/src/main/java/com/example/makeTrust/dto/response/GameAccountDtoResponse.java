package com.example.makeTrust.dto.response;

import com.example.makeTrust.enity.LinkInfo;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GameAccountDtoResponse {

    Double price;
    String accountId;
    Set<LinkInfo> linkInfos;
    Integer gameId;
}
