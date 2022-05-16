package com.steadyin.stringhandler.dto;

import lombok.Getter;

@Getter
public class OutputUnit {
    private final String quotient;
    private final String remainder;

    public OutputUnit(final String str, final Integer unitCount) {
        final int length = str.length();
        final int remainCount = length % unitCount;
        final int devideStandard = length - remainCount;

        this.quotient = str.substring(0, devideStandard);
        this.remainder = str.substring(devideStandard, length);
    }
}