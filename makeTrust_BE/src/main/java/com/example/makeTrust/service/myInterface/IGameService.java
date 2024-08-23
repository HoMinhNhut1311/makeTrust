package com.example.makeTrust.service.myInterface;

import com.example.makeTrust.dto.request.GameDtoRequest;
import com.example.makeTrust.dto.request.GameInfoDtoRequest;
import com.example.makeTrust.dto.response.GameDtoResponse;

import java.util.Set;

public interface IGameService {

    GameDtoResponse createGame(GameDtoRequest request);

    Set<GameDtoResponse> getAllGame();

    GameDtoResponse findGameByGameId(Integer gameId);

    GameDtoResponse findGameByGameCode(String gameCode);

    GameDtoResponse updateGameById(Integer gameId, GameInfoDtoRequest infoDtoRequest);
    void deleteGameByGameId(Integer gameId);

    void deleteGameByGameCode(String gameId);
}
