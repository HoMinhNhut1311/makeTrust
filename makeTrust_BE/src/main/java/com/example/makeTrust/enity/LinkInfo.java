package com.example.makeTrust.enity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "link_info")
public class LinkInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer linkInfoId;

    String linkInfoName;

    String linkInfoDes;

    @JsonBackReference
    @ManyToMany(mappedBy = "linkInfos",fetch = FetchType.LAZY)
    Set<GameAccount> gameAccounts;
}
