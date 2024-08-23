package com.example.makeTrust.enity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@FieldDefaults(level = AccessLevel.PROTECTED)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String accountId;

    Double price;

    @ManyToOne
    @JoinColumn(name = "game_id")
    Game game;

    @JsonManagedReference
    @ManyToMany(fetch = FetchType.LAZY)
            @JoinTable(name = "game_accounts_link_info",
                joinColumns = @JoinColumn(name = "game_account_id"),
                    inverseJoinColumns = @JoinColumn(name = "link_info_id")
            )
    Set<LinkInfo> linkInfos;

}
