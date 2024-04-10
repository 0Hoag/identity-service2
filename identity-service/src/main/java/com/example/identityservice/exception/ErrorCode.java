package com.example.identityservice.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
@Getter
public enum ErrorCode {
    UNCATEGORIZE_EXCEPTION(9999,"UNCATEGORIZE_EXCEPTION", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_KEY(1001,"INVALID MESSAGE KEY",HttpStatus.BAD_REQUEST),
    USER_EXITSTED(1002,"USER EXITED",HttpStatus.BAD_REQUEST),
    USERNAME_INVALID(1003,"USERNAME MUST AT LEES THAN 3 CHARACTER",HttpStatus.BAD_REQUEST),
    INVALID_PASSWORD(1004,"PASSWORD NOT BE AT LEES THAN 6 CHARACTER",HttpStatus.BAD_REQUEST),
    USER_NOT_EXISTED(1005,"USER_NOT_EXISTED", HttpStatus.NOT_FOUND),
    UNAUTHENTICATED(1006,"UNAUTHENTICATED", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZE(1007,"YOU DO NOT HAVE PREMISSION", HttpStatus.FORBIDDEN),
    ;
    private int code;
    private String message;
    private HttpStatusCode statusCode;

     ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }

     ErrorCode() {

    }
}
