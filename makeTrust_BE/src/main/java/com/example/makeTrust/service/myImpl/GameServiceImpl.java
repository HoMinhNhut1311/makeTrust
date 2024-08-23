package com.example.makeTrust.service.myImpl;

import com.example.makeTrust.dto.request.GameDtoRequest;
import com.example.makeTrust.dto.request.GameInfoDtoRequest;
import com.example.makeTrust.dto.response.GameDtoResponse;
import com.example.makeTrust.enity.Game;
import com.example.makeTrust.exception.myErrorE;
import com.example.makeTrust.exception.myException;
import com.example.makeTrust.mapper.IMyMapper;
import com.example.makeTrust.myEnum.GameE;
import com.example.makeTrust.repository.GameRepository;
import com.example.makeTrust.service.myInterface.IGameService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class GameServiceImpl implements IGameService {

    GameRepository gameRepository;
    IMyMapper<GameDtoRequest, Game, GameDtoResponse> gameMapper;
    @Override
    public GameDtoResponse createGame(GameDtoRequest request) {
        Game game = gameMapper.mapFormRequest(request);
        return gameMapper.mapToResponse(gameRepository.save(game));
    }

    @Override
    public Set<GameDtoResponse> getAllGame() {
        List<GameDtoResponse> responses =
                gameRepository.findAll().stream().map(gameMapper::mapToResponse).toList();
        return new HashSet<>(responses);
    }

    @Override
    public GameDtoResponse findGameByGameId(Integer gameId) {
        Game game = gameRepository.findById(gameId).orElseThrow(
                () -> new myException(myErrorE.GameIdNotFound)
        );
        return gameMapper.mapToResponse(game);
    }

    @Override
    public GameDtoResponse findGameByGameCode(String gameCode) {
        Game game = gameRepository.findByGameCode(gameCode).orElseThrow(
                () -> new myException(myErrorE.GameCodeNotFound)
        );
        return gameMapper.mapToResponse(game);
    }

    @Override
    public GameDtoResponse updateGameById(Integer gameId, GameInfoDtoRequest infoDtoRequest) {
        Game game = gameRepository.findById(gameId).orElseThrow(
                () -> new myException(myErrorE.GameIdNotFound)
        );
        return gameMapper.mapToResponse(game);
    }

    @Override
    public void deleteGameByGameId(Integer gameId) {
        Game game = gameRepository.findById(gameId).orElseThrow(
                () -> new myException(myErrorE.GameIdNotFound)
        );
        gameRepository.deleteById(gameId);

    }

    @Override
    public void deleteGameByGameCode(String gameCode) {
        Game game = gameRepository.findByGameCode(gameCode).orElseThrow(
                () -> new myException(myErrorE.GameIdNotFound)
        );
        gameRepository.deleteById(game.getGameId());
    }
}
