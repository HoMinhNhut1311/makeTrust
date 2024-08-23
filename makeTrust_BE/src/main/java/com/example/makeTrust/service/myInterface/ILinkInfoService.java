package com.example.makeTrust.service.myInterface;

import com.example.makeTrust.dto.request.LinkInfoDtoRequest;
import com.example.makeTrust.dto.response.LinkInfoDtoResponse;

import java.util.Set;

public interface ILinkInfoService {

    Set<LinkInfoDtoResponse> getAllLinkInfo();

    LinkInfoDtoResponse getLinkInfoById(Integer linkInfoId);

    LinkInfoDtoResponse createLinkInfo(LinkInfoDtoRequest request);

    LinkInfoDtoResponse updateLinkInfo(LinkInfoDtoRequest request, Integer linkInfoId);

    void deleteLinkInfoById(Integer linkInfoId);



}
