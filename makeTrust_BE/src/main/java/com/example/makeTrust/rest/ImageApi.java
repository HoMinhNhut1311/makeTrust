package com.example.makeTrust.rest;

import com.example.makeTrust.service.myInterface.IImageService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@RequestMapping("/images")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class ImageApi {

    IImageService imageService;

    @PostMapping("/{userId}")
    public ResponseEntity<Map> uploadFileToUser(
            @RequestParam("image") MultipartFile file, @PathVariable("userId") String userId
            ) {
        Map res = imageService.uploadToUser(file, userId);
        return ResponseEntity.ok(res);
    }
}
