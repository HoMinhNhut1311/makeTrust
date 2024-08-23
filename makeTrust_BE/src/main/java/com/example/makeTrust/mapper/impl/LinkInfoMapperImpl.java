package com.example.makeTrust.mapper.impl;

import com.example.makeTrust.dto.request.LinkInfoDtoRequest;
import com.example.makeTrust.dto.response.LinkInfoDtoResponse;
import com.example.makeTrust.enity.LinkInfo;
import com.example.makeTrust.mapper.IMyMapper;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
@Component
public class LinkInfoMapperImpl implements IMyMapper<LinkInfoDtoRequest, LinkInfo, LinkInfoDtoResponse> {

    ModelMapper modelMapper;

    @Override
    public LinkInfo mapFormRequest(LinkInfoDtoRequest request) {
        LinkInfo linkInfo = modelMapper.map(request, LinkInfo.class);
        return linkInfo;
    }

    @Override
    public LinkInfoDtoResponse mapToResponse(LinkInfo linkInfo) {
        LinkInfoDtoResponse response = modelMapper.map(linkInfo, LinkInfoDtoResponse.class);
        return response;
    }
}
