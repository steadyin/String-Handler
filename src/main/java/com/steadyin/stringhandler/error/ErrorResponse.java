package com.steadyin.stringhandler.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ErrorResponse {
    private final String errorMessage;
    private final String errorCode;
}
