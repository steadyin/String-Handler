package com.steadyin.stringhandler.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

//response -> 몫, 나머지
@RequiredArgsConstructor
@Getter
public class ParseResponse {
    private final String quotient;
    private final String remainder;

    public ParseResponse(OutputUnit outputUnit) {
        this.quotient = outputUnit.getQuotient();
        this.remainder = outputUnit.getRemainder();
    }
}