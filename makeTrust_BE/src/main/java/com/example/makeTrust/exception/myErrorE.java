package com.example.makeTrust.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
@AllArgsConstructor
public enum myErrorE {
    UserIdNotExist("UserId không tồn tại",1007,HttpStatus.NOT_FOUND),
    GameAccountIdNotFound("GameAccountId không tồn tại", 1006, HttpStatus.NOT_FOUND),
    LinkInfoIdNotFound("LinkInfoId không tồn tại",1005, HttpStatus.NOT_FOUND),
    GameExistButMaintaining("Thể loại Game đang trong quá trình bảo trình",
            1004,HttpStatus.METHOD_NOT_ALLOWED),
    AovAcIdNotFound("AovAc Id không tồn tại", 1003, HttpStatus.NOT_FOUND),
    GameCodeNotFound("Game Code không tồn tại", 1002, HttpStatus.NOT_FOUND),
    GameIdNotFound("Game Id không tồn tại", 1001, HttpStatus.NOT_FOUND),
    GameIsNotSupport("Hệ thống chưa hỗ trợ game này",1000, HttpStatus.NOT_IMPLEMENTED)
    ;

    private String errorName;
    private Integer errorCode;
    private HttpStatus httpStatus;
}
