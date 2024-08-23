package com.example.makeTrust.mapper.impl;

import com.example.makeTrust.dto.response.GameAccountDtoResponse;
import com.example.makeTrust.enity.GameAccount;
import com.example.makeTrust.mapper.IMyMapper;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
@Component
public class GameAccountMapperImpl implements IMyMapper<GameAccount, GameAccount, GameAccountDtoResponse> {

    ModelMapper modelMapper;

    @Override
    public GameAccount mapFormRequest(GameAccount gameAccount) {
        GameAccount account = modelMapper.map(gameAccount, GameAccount.class);
        return account;
    }

    @Override
    public GameAccountDtoResponse mapToResponse(GameAccount gameAccount) {
        GameAccountDtoResponse response = modelMapper.map(gameAccount, GameAccountDtoResponse.class);
        return response;
    }
}
