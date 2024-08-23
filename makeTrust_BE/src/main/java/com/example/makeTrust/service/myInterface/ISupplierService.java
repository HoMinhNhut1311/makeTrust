package com.example.makeTrust.service.myInterface;

import com.example.makeTrust.dto.request.UserDtoRequest;
import com.example.makeTrust.dto.response.UserDtoResponse;

import java.util.Set;

public interface ISupplierService {

    UserDtoResponse addSupplier(UserDtoRequest request);

    Set<UserDtoResponse> getAllSupplier();

    UserDtoResponse getSupplierById(String supplierId);

    UserDtoResponse updateSupplierById(UserDtoRequest request, String supplierId);

    void deleteSupplierById(String supplierId);
}
