package com.example.makeTrust.service.myImpl;

import com.example.makeTrust.dto.request.UserDtoRequest;
import com.example.makeTrust.dto.response.UserDtoResponse;
import com.example.makeTrust.enity.myRole.Supplier;
import com.example.makeTrust.mapper.IMyMapper;
import com.example.makeTrust.repository.SupplierRepository;
import com.example.makeTrust.service.myInterface.ISupplierService;
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
public class SupplierServiceImpl implements ISupplierService {

    SupplierRepository supplierRepository;
    IMyMapper<UserDtoRequest, Supplier, UserDtoResponse> supplierMapper;
    @Override
    public UserDtoResponse addSupplier(UserDtoRequest request) {
        Supplier supplier = supplierMapper.mapFormRequest(request);
        return supplierMapper.mapToResponse(supplierRepository.save(supplier));
    }

    @Override
    public Set<UserDtoResponse> getAllSupplier() {
        List<UserDtoResponse> responses =
                supplierRepository.findAll().stream().map(supplierMapper::mapToResponse).toList();
        return new HashSet<>(responses);
    }

    @Override
    public UserDtoResponse getSupplierById(String supplierId) {
        Supplier response = supplierRepository.findById(supplierId).orElseThrow();
        return supplierMapper.mapToResponse(response);
    }

    @Override
    public UserDtoResponse updateSupplierById(UserDtoRequest request, String supplierId) {
        Supplier response = supplierRepository.findById(supplierId).orElseThrow();
        Supplier supplierNew = supplierMapper.mapFormRequest(request);
        supplierNew.setUserId(supplierId);
        return supplierMapper.mapToResponse(response);
    }

    @Override
    public void deleteSupplierById(String supplierId) {
        Supplier response = supplierRepository.findById(supplierId).orElseThrow();
        supplierRepository.deleteById(supplierId);
    }
}
