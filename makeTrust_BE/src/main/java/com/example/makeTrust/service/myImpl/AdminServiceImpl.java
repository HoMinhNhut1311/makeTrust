package com.example.makeTrust.service.myImpl;

import com.example.makeTrust.dto.request.UserDtoRequest;
import com.example.makeTrust.dto.response.UserDtoResponse;
import com.example.makeTrust.enity.myRole.Admin;
import com.example.makeTrust.mapper.IMyMapper;
import com.example.makeTrust.repository.AdminRepository;
import com.example.makeTrust.repository.GameRepository;
import com.example.makeTrust.service.myInterface.IAdminService;
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
public class AdminServiceImpl implements IAdminService {

    AdminRepository adminRepository;
    IMyMapper<UserDtoRequest, Admin, UserDtoResponse> adminMapper;
    private final GameRepository gameRepository;

    @Override
    public UserDtoResponse addAdmin(UserDtoRequest request) {
        Admin admin = adminMapper.mapFormRequest(request);
        return adminMapper.mapToResponse(adminRepository.save(admin));
    }

    @Override
    public Set<UserDtoResponse> getAllAdmin() {
        List<UserDtoResponse> responses =
                adminRepository.findAll().stream().map(adminMapper::mapToResponse).toList();
        return new HashSet<>(responses);
    }

    @Override
    public UserDtoResponse findAdminById(String adminId) {
        Admin admin = adminRepository.findById(adminId).orElseThrow();
        return adminMapper.mapToResponse(admin);
    }

    @Override
    public UserDtoResponse updateAdmin(UserDtoRequest request, String adminId) {
        Admin admin = adminRepository.findById(adminId).orElseThrow();
        return adminMapper.mapToResponse(admin);
    }

    @Override
    public void deleteAdminById(String adminId) {
        adminRepository.deleteById(adminId);
    }
}
