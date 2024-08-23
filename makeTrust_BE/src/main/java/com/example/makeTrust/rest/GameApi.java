package com.example.makeTrust.rest;


import com.example.makeTrust.dto.request.GameDtoRequest;
import com.example.makeTrust.dto.request.GameInfoDtoRequest;
import com.example.makeTrust.dto.response.GameDtoResponse;
import com.example.makeTrust.service.myInterface.IGameService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/games")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class GameApi {
    IGameService gameService;


    @GetMapping
    public ResponseEntity<Set<GameDtoResponse>> findAllGame() {
        Set<GameDtoResponse> responses = gameService.getAllGame();
        return ResponseEntity.ok(responses);
    }

    @GetMapping("/{gameId}")
    public ResponseEntity<GameDtoResponse> findGameByGameId(
            @PathVariable("gameId") Integer gameId
    ) {
        GameDtoResponse response = gameService.findGameByGameId(gameId);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/code/{gameCode}")
    public ResponseEntity<GameDtoResponse> findGameByGameCode(
            @PathVariable("gameCode") String gameCode
    ) {
        GameDtoResponse response = gameService.findGameByGameCode(gameCode);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<GameDtoResponse> createGame(
            @RequestBody GameDtoRequest gameDtoRequest
    ) {
        GameDtoResponse response = gameService.createGame(gameDtoRequest);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{gameId}")
    public ResponseEntity<GameDtoResponse> updateGameById(
            @PathVariable("gameId") Integer gameId, @RequestBody GameInfoDtoRequest infoDtoRequest
            ) {
        GameDtoResponse response = gameService.updateGameById(gameId, infoDtoRequest);
        return ResponseEntity.ok(response);
    }


}
