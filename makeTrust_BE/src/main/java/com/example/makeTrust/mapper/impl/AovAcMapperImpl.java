package com.example.makeTrust.mapper.impl;

import com.example.makeTrust.dto.request.AovAcDtoRequest;
import com.example.makeTrust.dto.request.UserDtoRequest;
import com.example.makeTrust.dto.response.AovAcDtoResponse;
import com.example.makeTrust.dto.response.UserDtoResponse;
import com.example.makeTrust.enity.Game;
import com.example.makeTrust.enity.myGame.AovAc;
import com.example.makeTrust.enity.myRole.Admin;
import com.example.makeTrust.exception.myErrorE;
import com.example.makeTrust.exception.myException;
import com.example.makeTrust.mapper.IMyMapper;
import com.example.makeTrust.myEnum.GameE;
import com.example.makeTrust.repository.GameRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
@Component
public class AovAcMapperImpl implements IMyMapper<AovAcDtoRequest, AovAc, AovAcDtoResponse> {

    ModelMapper modelMapper;
    GameRepository gameRepository;

    @Override
    public AovAc mapFormRequest(AovAcDtoRequest request) {
        Game game = gameRepository.findByGameCode(GameE.AOV.getGameCode()).orElseThrow(
                () -> new myException(myErrorE.GameExistButMaintaining)
        );
        AovAc aovAc = modelMapper.map(request, AovAc.class);
        aovAc.setGame(game);
        return aovAc;
    }

    @Override
    public AovAcDtoResponse mapToResponse(AovAc aovAc) {
        AovAcDtoResponse response = modelMapper.map(aovAc, AovAcDtoResponse.class);
        return response;
    }
}
