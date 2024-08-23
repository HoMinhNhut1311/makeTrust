package com.example.makeTrust.service.myInterface;

import com.example.makeTrust.dto.request.UserDtoRequest;
import com.example.makeTrust.dto.response.UserDtoResponse;
import com.example.makeTrust.enity.myRole.Shopper;

import java.util.Set;

public interface IShopperService {

    UserDtoResponse addShopper(UserDtoRequest request);

    Set<UserDtoResponse> getAllShopper();

    UserDtoResponse getShopperById(String shopperId);

    UserDtoResponse updateShopperById(UserDtoRequest request, String shopperId);

    void deleteShopperById(String shopperId);
}
