package com.example.makeTrust.mapper.impl;

import com.example.makeTrust.dto.request.UserDtoRequest;
import com.example.makeTrust.dto.response.UserDtoResponse;
import com.example.makeTrust.enity.myRole.Admin;
import com.example.makeTrust.mapper.IMyMapper;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
@Component
public class AdminMapperImpl implements IMyMapper<UserDtoRequest, Admin, UserDtoResponse> {

    ModelMapper modelMapper;

    @Override
    public Admin mapFormRequest(UserDtoRequest userDtoRequest) {
        Admin user = modelMapper.map(userDtoRequest, Admin.class);
        return user;
    }

    @Override
    public UserDtoResponse mapToResponse(Admin user) {
        UserDtoResponse response = modelMapper.map(user, UserDtoResponse.class);
        return response;
    }
}
