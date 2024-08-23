package com.example.makeTrust.mapper.impl;

import com.example.makeTrust.dto.request.UserDtoRequest;
import com.example.makeTrust.dto.response.UserDtoResponse;
import com.example.makeTrust.enity.myRole.Supplier;
import com.example.makeTrust.mapper.IMyMapper;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
@Component
public class SupplierMapperImpl implements IMyMapper<UserDtoRequest, Supplier, UserDtoResponse> {

    ModelMapper modelMapper;

    @Override
    public Supplier mapFormRequest(UserDtoRequest userDtoRequest) {
        Supplier user = modelMapper.map(userDtoRequest, Supplier.class);
        user.setBalance(0.0);
        return user;
    }

    @Override
    public UserDtoResponse mapToResponse(Supplier user) {
        UserDtoResponse response = modelMapper.map(user, UserDtoResponse.class);
        return response;
    }
}
