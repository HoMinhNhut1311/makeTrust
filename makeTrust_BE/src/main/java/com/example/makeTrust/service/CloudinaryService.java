package com.example.makeTrust.service;

import com.cloudinary.Cloudinary;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
@Service
public class CloudinaryService {

    Cloudinary cloudinary;

    public Map upload(MultipartFile multipartFile, String folderName) throws IOException {
        Map<String, String> uploadParams = new HashMap<>();
        uploadParams.put("folder", folderName);
        uploadParams.put("resource_type","auto");

        return cloudinary.uploader().upload(multipartFile.getBytes(), uploadParams);
    };

    public Map destroy(String cloudinaryId) throws IOException {
        Map<String, String> deleteParams = new HashMap<>();

        return cloudinary.uploader().destroy(cloudinaryId,deleteParams);
    };
}
