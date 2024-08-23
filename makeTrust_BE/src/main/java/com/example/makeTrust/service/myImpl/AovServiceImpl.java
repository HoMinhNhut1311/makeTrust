package com.example.makeTrust.service.myImpl;

import com.example.makeTrust.dto.request.AovAcDtoRequest;
import com.example.makeTrust.dto.response.AovAcDtoResponse;
import com.example.makeTrust.enity.myGame.AovAc;
import com.example.makeTrust.exception.myErrorE;
import com.example.makeTrust.exception.myException;
import com.example.makeTrust.mapper.IMyMapper;
import com.example.makeTrust.repository.AovAcRepository;
import com.example.makeTrust.service.myInterface.IAovAcService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
@Service
public class AovServiceImpl implements IAovAcService {

    AovAcRepository aovAcRepository;
    IMyMapper<AovAcDtoRequest, AovAc, AovAcDtoResponse> aovAcMapper;
    @Override
    public Set<AovAcDtoResponse> getAllAovAc() {
        List<AovAcDtoResponse> responses =
                aovAcRepository.findAll().stream().map(aovAcMapper::mapToResponse).toList();
        return new HashSet<>(responses);
    }

    @Override
    public AovAcDtoResponse createAovAc(AovAcDtoRequest request) {
        AovAc aovAc = aovAcMapper.mapFormRequest(request);
        return aovAcMapper.mapToResponse(aovAcRepository.save(aovAc));
    }

    @Override
    public AovAcDtoResponse getAovAcById(String aovId) {
        AovAc aovAc = aovAcRepository.findById(aovId).orElseThrow(
                () -> new myException(myErrorE.AovAcIdNotFound)
        );
        return aovAcMapper.mapToResponse(aovAc);
    }

    @Override
    public AovAcDtoResponse updateAovAc(AovAcDtoRequest request, String aovId) {
        AovAc aovAc = aovAcRepository.findById(aovId).orElseThrow(
                () -> new myException(myErrorE.AovAcIdNotFound)
        );
        AovAc aovAcNew = aovAcMapper.mapFormRequest(request);
        aovAcNew.setAccountId(aovId);
        return aovAcMapper.mapToResponse(aovAcRepository.save(aovAcNew));
    }

    @Override
    public void deleteAovAcById(String aovId) {
        AovAc aovAc = aovAcRepository.findById(aovId).orElseThrow(
                () -> new myException(myErrorE.AovAcIdNotFound)
        );
        aovAcRepository.deleteById(aovId);
    }
}
