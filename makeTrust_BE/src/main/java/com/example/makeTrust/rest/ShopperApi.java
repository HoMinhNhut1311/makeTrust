package com.example.makeTrust.rest;

import com.example.makeTrust.dto.request.UserDtoRequest;
import com.example.makeTrust.dto.response.UserDtoResponse;
import com.example.makeTrust.service.myInterface.IShopperService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/shoppers")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class ShopperApi {

    IShopperService shopperService;

    @GetMapping
    public ResponseEntity<
            Set<UserDtoResponse>> getAllShopper() {
        Set<UserDtoResponse> responses = shopperService.getAllShopper();
        return ResponseEntity.ok(responses);
    }

    @GetMapping("/{shopperId}")
    public ResponseEntity<UserDtoResponse> getShopperById(
            @PathVariable String shopperId
    ) {
        UserDtoResponse response = shopperService.getShopperById(shopperId);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<UserDtoResponse> saveShopper(
            @RequestBody UserDtoRequest request
            ) {
        UserDtoResponse response = shopperService.addShopper(request);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{shopperId}")
    public ResponseEntity<UserDtoResponse> updateShopper(
            @RequestBody UserDtoRequest request, @PathVariable String shopperId
    ) {
        UserDtoResponse response = shopperService.updateShopperById(request, shopperId);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{shopperId}")
    public ResponseEntity<Void> deleteShopper(
            @PathVariable String shopperId
    ) {
        shopperService.deleteShopperById(shopperId);
        return ResponseEntity.noContent().build();
    }
}
