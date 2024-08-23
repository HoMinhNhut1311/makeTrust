package com.example.makeTrust.rest;

import com.example.makeTrust.dto.request.UserDtoRequest;
import com.example.makeTrust.dto.response.UserDtoResponse;
import com.example.makeTrust.service.myInterface.IAdminService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/admins")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class AdminApi {

    IAdminService adminService;

    @GetMapping
    public ResponseEntity<
            Set<UserDtoResponse>> getAllAdmin() {
        Set<UserDtoResponse> responses = adminService.getAllAdmin();
        return ResponseEntity.ok(responses);
    }

    @GetMapping("/{adminId}")
    public ResponseEntity<UserDtoResponse> getAdminById(
            @PathVariable("adminId") String adminId
    ) {
        UserDtoResponse response = adminService.findAdminById(adminId);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<UserDtoResponse> addAdmin(
            @RequestBody UserDtoRequest request
            ) {
        UserDtoResponse response = adminService.addAdmin(request);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{adminId}")
    public ResponseEntity<UserDtoResponse> updateAdmin(
            @RequestBody UserDtoRequest request, @PathVariable String adminId
    ) {
        UserDtoResponse response = adminService.updateAdmin(request, adminId);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{adminId}")
    public ResponseEntity<Void> deleteAdminById(
            @PathVariable("adminId") String adminId
    ) {
        adminService.deleteAdminById(adminId);
        return ResponseEntity.noContent().build();
    }


}
