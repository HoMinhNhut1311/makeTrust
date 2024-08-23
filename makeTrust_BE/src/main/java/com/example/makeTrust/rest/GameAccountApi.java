package com.example.makeTrust.rest;

import com.example.makeTrust.dto.request.AddLinkAccountRequest;
import com.example.makeTrust.dto.response.GameAccountDtoResponse;
import com.example.makeTrust.service.myInterface.IGameAccountService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/gac")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class GameAccountApi {

    IGameAccountService gameAccountService;

    @GetMapping
    public ResponseEntity<Set<GameAccountDtoResponse>> getAllGameAccount() {
        Set<GameAccountDtoResponse> responses = gameAccountService.getAllGameAccount();
        return ResponseEntity.ok(responses);
    }

    @PutMapping
    public ResponseEntity<GameAccountDtoResponse> addLinkInfoToAccount(
            @RequestBody AddLinkAccountRequest request
            ) {
        GameAccountDtoResponse response =
                gameAccountService.addLinkInfo(request.getAccountId(), request.getLinkInfoId());
        return ResponseEntity.ok(response);
    }
}
