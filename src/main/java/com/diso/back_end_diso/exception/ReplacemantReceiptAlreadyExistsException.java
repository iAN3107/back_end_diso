package com.diso.back_end_diso.exception;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@AllArgsConstructor
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ReplacemantReceiptAlreadyExistsException extends RuntimeException{
    private String message;
}
