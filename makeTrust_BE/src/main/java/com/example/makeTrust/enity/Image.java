package com.example.makeTrust.enity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "images")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Image{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String imageId;

    String imageUrl;

    String imageName;

    String cloudinaryId;
}
