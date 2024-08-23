package com.example.makeTrust.rest;

import com.example.makeTrust.dto.request.UserDtoRequest;
import com.example.makeTrust.dto.response.UserDtoResponse;
import com.example.makeTrust.service.myInterface.ISupplierService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/suppliers")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class SupplierApi {

    ISupplierService supplierService;

    @GetMapping
    public ResponseEntity<
            Set<UserDtoResponse>> getAllShopper() {
        Set<UserDtoResponse> responses = supplierService.getAllSupplier();
        return ResponseEntity.ok(responses);
    }

    @GetMapping("/{supplierId}")
    public ResponseEntity<UserDtoResponse> getShopperById(
            @PathVariable String supplierId
    ) {
        UserDtoResponse response = supplierService.getSupplierById(supplierId);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<UserDtoResponse> saveShopper(
            @RequestBody UserDtoRequest request
    ) {
        UserDtoResponse response = supplierService.addSupplier(request);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{supplierId}")
    public ResponseEntity<UserDtoResponse> updateShopper(
            @RequestBody UserDtoRequest request, @PathVariable String supplierId
    ) {
        UserDtoResponse response = supplierService.updateSupplierById(request, supplierId);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{supplierId}")
    public ResponseEntity<Void> deleteShopper(
            @PathVariable String supplierId
    ) {
        supplierService.deleteSupplierById(supplierId);
        return ResponseEntity.noContent().build();
    }
}
