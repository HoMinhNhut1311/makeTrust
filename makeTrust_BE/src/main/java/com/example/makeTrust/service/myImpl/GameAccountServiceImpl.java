package com.example.makeTrust.service.myImpl;

import com.example.makeTrust.dto.response.GameAccountDtoResponse;
import com.example.makeTrust.dto.response.GameDtoResponse;
import com.example.makeTrust.enity.GameAccount;
import com.example.makeTrust.enity.LinkInfo;
import com.example.makeTrust.exception.myErrorE;
import com.example.makeTrust.exception.myException;
import com.example.makeTrust.mapper.IMyMapper;
import com.example.makeTrust.repository.GameAccountRepository;
import com.example.makeTrust.repository.LinkInfoRepository;
import com.example.makeTrust.service.myInterface.IGameAccountService;
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
public class GameAccountServiceImpl implements IGameAccountService {

    GameAccountRepository gameAccountRepository;

    LinkInfoRepository linkInfoRepository;
    IMyMapper<GameAccount, GameAccount, GameAccountDtoResponse> gameAccountMapper;
    @Override
    public GameAccountDtoResponse addLinkInfo(String accountId, Integer linkInfoId) {
        GameAccount gameAccount = gameAccountRepository.findById(accountId).orElseThrow(
                () -> new myException(myErrorE.GameAccountIdNotFound)
        );
        LinkInfo linkInfo = linkInfoRepository.findById(linkInfoId).orElseThrow(
                () -> new myException(myErrorE.LinkInfoIdNotFound)
        );

        Set<LinkInfo> linkInfos = gameAccount.getLinkInfos();
        linkInfos.add(linkInfo);
        gameAccount.setLinkInfos(linkInfos);
        return gameAccountMapper.mapToResponse(gameAccountRepository.save(gameAccount));
    }

    @Override
    public Set<GameAccountDtoResponse> getAllGameAccount() {
        List<GameAccountDtoResponse> responses =
                gameAccountRepository.findAll().stream().map(gameAccountMapper::mapToResponse).toList();
        return new HashSet<>(responses);
    }
}
