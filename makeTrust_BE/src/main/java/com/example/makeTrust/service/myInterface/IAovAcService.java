package com.example.makeTrust.service.myInterface;

import com.example.makeTrust.dto.request.AovAcDtoRequest;
import com.example.makeTrust.dto.response.AovAcDtoResponse;

import java.util.Set;

public interface IAovAcService {

    Set<AovAcDtoResponse> getAllAovAc();

    AovAcDtoResponse getAovAcById(String aovId);

    AovAcDtoResponse createAovAc(AovAcDtoRequest request);

    AovAcDtoResponse updateAovAc(AovAcDtoRequest request, String aovId);

    void deleteAovAcById(String aovId);
}
