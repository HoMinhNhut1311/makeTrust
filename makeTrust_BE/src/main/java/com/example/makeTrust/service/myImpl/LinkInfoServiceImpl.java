package com.example.makeTrust.service.myImpl;

import com.example.makeTrust.dto.request.LinkInfoDtoRequest;
import com.example.makeTrust.dto.response.LinkInfoDtoResponse;
import com.example.makeTrust.enity.LinkInfo;
import com.example.makeTrust.exception.myErrorE;
import com.example.makeTrust.exception.myException;
import com.example.makeTrust.mapper.IMyMapper;
import com.example.makeTrust.repository.LinkInfoRepository;
import com.example.makeTrust.service.myInterface.ILinkInfoService;
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
public class LinkInfoServiceImpl implements ILinkInfoService {

    LinkInfoRepository linkInfoRepository;

    IMyMapper<LinkInfoDtoRequest, LinkInfo, LinkInfoDtoResponse> linkInfoMapper;
    @Override
    public Set<LinkInfoDtoResponse> getAllLinkInfo() {
        List<LinkInfoDtoResponse> responses =
                linkInfoRepository.findAll().stream().map(linkInfoMapper::mapToResponse).toList();
        return new HashSet<>(responses);
    }

    @Override
    public LinkInfoDtoResponse getLinkInfoById(Integer linkInfoId) {
        LinkInfo linkInfo = linkInfoRepository.findById(linkInfoId).orElseThrow(
                () -> new myException(myErrorE.LinkInfoIdNotFound)
        );
        return linkInfoMapper.mapToResponse(linkInfo);
    }

    @Override
    public LinkInfoDtoResponse createLinkInfo(LinkInfoDtoRequest request) {
        LinkInfo linkInfoDtoRequest = linkInfoMapper.mapFormRequest(request);
        return linkInfoMapper.mapToResponse(linkInfoRepository.save(linkInfoDtoRequest));
    }

    @Override
    public LinkInfoDtoResponse updateLinkInfo(LinkInfoDtoRequest request, Integer linkInfoId) {
        LinkInfo linkInfo = linkInfoRepository.findById(linkInfoId).orElseThrow(
                () -> new myException(myErrorE.LinkInfoIdNotFound)
        );
        LinkInfo linkInfoNew = linkInfoMapper.mapFormRequest(request);
        linkInfoNew.setLinkInfoId(linkInfoId);
        return linkInfoMapper.mapToResponse(linkInfoRepository.save(linkInfoNew));
    }

    @Override
    public void deleteLinkInfoById(Integer linkInfoId) {
        LinkInfo linkInfo = linkInfoRepository.findById(linkInfoId).orElseThrow(
                () -> new myException(myErrorE.LinkInfoIdNotFound)
        );
        linkInfoRepository.deleteById(linkInfoId);
    }
}
