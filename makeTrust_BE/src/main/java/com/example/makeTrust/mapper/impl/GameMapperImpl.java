package com.example.makeTrust.mapper.impl;

import com.example.makeTrust.dto.request.GameDtoRequest;
import com.example.makeTrust.dto.request.UserDtoRequest;
import com.example.makeTrust.dto.response.GameDtoResponse;
import com.example.makeTrust.dto.response.UserDtoResponse;
import com.example.makeTrust.enity.Game;
import com.example.makeTrust.enity.myRole.Admin;
import com.example.makeTrust.mapper.IMyMapper;
import com.example.makeTrust.myEnum.GameE;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
@Component
public class GameMapperImpl implements IMyMapper<GameDtoRequest, Game, GameDtoResponse> {

    ModelMapper modelMapper;

    @Override
    public Game mapFormRequest(GameDtoRequest gameDtoRequest) {
        GameE gameE = GameE.fromGameCode(gameDtoRequest.getGameCode());
        Game game = modelMapper.map(gameDtoRequest, Game.class);
        game.setGameName(gameE.getGameName());
        game.setGameCode(gameE.getGameCode());
        return game;
    }

    @Override
    public GameDtoResponse mapToResponse(Game game) {
        GameDtoResponse response = modelMapper.map(game, GameDtoResponse.class);
        return response;
    }
}
