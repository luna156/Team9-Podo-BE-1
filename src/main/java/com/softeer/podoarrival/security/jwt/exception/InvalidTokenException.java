package com.softeer.podoarrival.security.jwt.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class InvalidTokenException extends RuntimeException{
    private String message;
}
