package com.example.makeTrust.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class myException extends RuntimeException{
    private myErrorE myErrorE;

    public myException(myErrorE myErrorE) {
        this.myErrorE = myErrorE;
    }
}
