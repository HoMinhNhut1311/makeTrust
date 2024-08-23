package com.example.makeTrust.service.myInterface;

import com.example.makeTrust.dto.response.GameAccountDtoResponse;
import com.example.makeTrust.enity.GameAccount;
import com.example.makeTrust.enity.LinkInfo;

import java.util.Set;

public interface IGameAccountService {

    Set<GameAccountDtoResponse> getAllGameAccount();

    GameAccountDtoResponse addLinkInfo(String accountId, Integer linkInfo);
}
