package com.steadyin.stringhandler.dto;

import lombok.RequiredArgsConstructor;

//response -> 몫, 나머지
@RequiredArgsConstructor
public class ParseResponse {
   private final String quotient;
   private final String remainder;
} 