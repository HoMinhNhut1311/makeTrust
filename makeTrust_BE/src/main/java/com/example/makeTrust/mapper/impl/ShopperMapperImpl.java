package com.example.makeTrust.mapper.impl;

import com.example.makeTrust.dto.request.UserDtoRequest;
import com.example.makeTrust.dto.response.UserDtoResponse;
import com.example.makeTrust.enity.myRole.Shopper;
import com.example.makeTrust.mapper.IMyMapper;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
@Component
public class ShopperMapperImpl implements IMyMapper<UserDtoRequest, Shopper, UserDtoResponse> {

    ModelMapper modelMapper;

    @Override
    public Shopper mapFormRequest(UserDtoRequest userDtoRequest) {
        Shopper user = modelMapper.map(userDtoRequest, Shopper.class);
        user.setBalance(0.0);
        return user;
    }

    @Override
    public UserDtoResponse mapToResponse(Shopper user) {
        UserDtoResponse response = modelMapper.map(user, UserDtoResponse.class);
        return response;
    }
}
