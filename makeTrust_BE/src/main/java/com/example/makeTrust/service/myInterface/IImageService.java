package com.example.makeTrust.service.myInterface;

import com.example.makeTrust.enity.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;
import java.util.Set;

public interface IImageService {


    Set<Image> getAllImage();

    Map uploadToUser(MultipartFile multipartFile, String userId);

    Image uploadToAovAccount(MultipartFile multipartFile, String aovAccount);

    void deleteByImageId(String imageId);

}
