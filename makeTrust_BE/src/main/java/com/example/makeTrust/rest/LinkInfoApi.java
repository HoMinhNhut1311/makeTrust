package com.example.makeTrust.rest;

import com.example.makeTrust.dto.request.LinkInfoDtoRequest;
import com.example.makeTrust.dto.response.LinkInfoDtoResponse;
import com.example.makeTrust.service.myInterface.ILinkInfoService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/linkInfos")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class LinkInfoApi {

    ILinkInfoService linkInfoService;

    @GetMapping
    public ResponseEntity<Set<LinkInfoDtoResponse>> getAllLinkInfos() {
        Set<LinkInfoDtoResponse> responses = linkInfoService.getAllLinkInfo();
        return ResponseEntity.ok(responses);
    }

    @GetMapping("/{linkInfoId}")
    public ResponseEntity<LinkInfoDtoResponse> getLinkInfoById(
            @PathVariable("linkInfoId") Integer linkInfoId
    ) {
        LinkInfoDtoResponse response = linkInfoService.getLinkInfoById(linkInfoId);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<LinkInfoDtoResponse> addLinkInfo(
            @RequestBody LinkInfoDtoRequest request
    ) {
        LinkInfoDtoResponse response = linkInfoService.createLinkInfo(request);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{linkInfoId}")
    public ResponseEntity<LinkInfoDtoResponse> updateLinkInfo(
            @RequestBody LinkInfoDtoRequest request, @PathVariable Integer linkInfoId
    ) {
        LinkInfoDtoResponse response = linkInfoService.updateLinkInfo(request, linkInfoId);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{linkInfoId}")
    public ResponseEntity<Void> deleteLinkInfoById(
            @PathVariable("linkInfoId") Integer linkInfoId
    ) {
        linkInfoService.deleteLinkInfoById(linkInfoId);
        return ResponseEntity.noContent().build();
    }
}
