package com.example.makeTrust.exception;

import com.example.makeTrust.dto.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalException {

        @ExceptionHandler(myException.class)
        public ResponseEntity<ApiResponse<myErrorE>> handleMyException(myException exception) {
                myErrorE myErrorE = exception.getMyErrorE();
                ApiResponse<myErrorE> errorEApiResponse = ApiResponse.<myErrorE>builder()
                        .code(myErrorE.getErrorCode())
                        .message(myErrorE.getErrorName())
                        .build();
                return ResponseEntity.status(myErrorE.getHttpStatus()).body(errorEApiResponse);
        }
}
