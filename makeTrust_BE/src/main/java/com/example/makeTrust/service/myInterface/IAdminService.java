package com.example.makeTrust.service.myInterface;

import com.example.makeTrust.dto.request.UserDtoRequest;
import com.example.makeTrust.dto.response.UserDtoResponse;

import java.util.Set;

public interface IAdminService {

    UserDtoResponse addAdmin(UserDtoRequest request);

    Set<UserDtoResponse> getAllAdmin();

    UserDtoResponse findAdminById(String adminId);

    UserDtoResponse updateAdmin(UserDtoRequest request, String adminId);

    void deleteAdminById(String adminId);


}
