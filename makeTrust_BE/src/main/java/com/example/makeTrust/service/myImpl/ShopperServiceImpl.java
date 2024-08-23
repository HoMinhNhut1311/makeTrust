package com.example.makeTrust.service.myImpl;

import com.example.makeTrust.dto.request.UserDtoRequest;
import com.example.makeTrust.dto.response.UserDtoResponse;
import com.example.makeTrust.enity.myRole.Shopper;
import com.example.makeTrust.mapper.IMyMapper;
import com.example.makeTrust.repository.ShopperRepository;
import com.example.makeTrust.service.myInterface.IShopperService;
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
public class ShopperServiceImpl implements IShopperService {

    ShopperRepository shopperRepository;
    IMyMapper<UserDtoRequest, Shopper, UserDtoResponse> shopperMapper;

    @Override
    public UserDtoResponse addShopper(UserDtoRequest request) {
        Shopper shopper = shopperMapper.mapFormRequest(request);
        return shopperMapper.mapToResponse(shopperRepository.save(shopper));
    }

    @Override
    public Set<UserDtoResponse> getAllShopper() {
        List<UserDtoResponse> responses =
                shopperRepository.findAll().stream().map(shopperMapper::mapToResponse).toList();
        return new HashSet<>(responses);
    }

    @Override
    public UserDtoResponse getShopperById(String shopperId) {
        Shopper response = shopperRepository.findById(shopperId).orElseThrow();
        return shopperMapper.mapToResponse(response);
    }

    @Override
    public UserDtoResponse updateShopperById(UserDtoRequest request, String shopperId) {
        Shopper exsShopper = shopperRepository.findById(shopperId).orElseThrow();
        Shopper shopperUpdate = shopperMapper.mapFormRequest(request);
        shopperUpdate.setUserId(shopperId);
        return shopperMapper.mapToResponse(shopperRepository.save(shopperUpdate));
    }

    @Override
    public void deleteShopperById(String shopperId) {
        Shopper exsShopper = shopperRepository.findById(shopperId).orElseThrow();
        shopperRepository.deleteById(shopperId);
    }
}
