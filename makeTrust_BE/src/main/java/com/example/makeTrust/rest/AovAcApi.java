package com.example.makeTrust.rest;

import com.example.makeTrust.dto.request.AovAcDtoRequest;
import com.example.makeTrust.dto.response.AovAcDtoResponse;
import com.example.makeTrust.service.myInterface.IAovAcService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/aovs")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class AovAcApi {

    IAovAcService aovAcService;

    @GetMapping
    public ResponseEntity<
                Set<AovAcDtoResponse>> getAllAovAc() {
        Set<AovAcDtoResponse> responses = aovAcService.getAllAovAc();
        return ResponseEntity.ok(responses);
    }

    @PostMapping
    public ResponseEntity<AovAcDtoResponse> createAovAc(
            @RequestBody AovAcDtoRequest request
            ) {
        AovAcDtoResponse response = aovAcService.createAovAc(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{aovId}")
    public ResponseEntity<AovAcDtoResponse> findAovAcById(
            @PathVariable("aovId") String aovId
    ) {
        AovAcDtoResponse response = aovAcService.getAovAcById(aovId);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{aovId}")
    public ResponseEntity<AovAcDtoResponse> updateAovAc(
            @RequestBody AovAcDtoRequest request, @PathVariable("aovId") String aovId
    ) {
        AovAcDtoResponse response = aovAcService.updateAovAc(request, aovId);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{aovId}")
    public ResponseEntity<Void> deleteAovAcById(
            @PathVariable("aovId") String aovId
    ) {
        aovAcService.deleteAovAcById(aovId);
        return ResponseEntity.noContent().build();
    }



}
