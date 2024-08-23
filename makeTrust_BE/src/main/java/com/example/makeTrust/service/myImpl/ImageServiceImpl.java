package com.example.makeTrust.service.myImpl;

import com.example.makeTrust.enity.Image;
import com.example.makeTrust.enity.User;
import com.example.makeTrust.exception.myErrorE;
import com.example.makeTrust.exception.myException;
import com.example.makeTrust.repository.ImageRepository;
import com.example.makeTrust.repository.UserRepository;
import com.example.makeTrust.service.CloudinaryService;
import com.example.makeTrust.service.myInterface.IImageService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
@Service
public class ImageServiceImpl implements IImageService {

    ImageRepository imageRepository;
    UserRepository userRepository;
    CloudinaryService cloudinaryService;


    @Override
    public Set<Image> getAllImage() {
        return new HashSet<>(imageRepository.findAll());
    }

    @Override
    public Map uploadToUser(MultipartFile multipartFile, String userId) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new myException(myErrorE.UserIdNotExist)
        );
        try {
            Map result = cloudinaryService.upload(multipartFile,"user");
            if (!result.isEmpty()) {
                // Them Image vao DB
                Image image = convertFileUploadToImageDatabase(result);
                image.setImageName(multipartFile.getName());
                imageRepository.save(image);
                user.setImage(image);
                userRepository.saveAndFlush(user);
            }
            return result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Image uploadToAovAccount(MultipartFile multipartFile, String aovAccount) {
        return null;
    }

    @Override
    public void deleteByImageId(String imageId) {

    }

    private Image convertFileUploadToImageDatabase(Map result) {
        Image image = Image.builder()
                .imageUrl(result.get("url").toString())
                .cloudinaryId(result.get("public_id").toString())
                .build();

        return image;
    }
}
