package com.steadyin.stringhandler.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

//request -> url, type(노출 유형), 출력 묶음 단위
@RequiredArgsConstructor
@Getter
public class ParseRequest {
    private final String url;
    private final ExposureType exposureType;
    private final Integer unitCount;
}