package com.steadyin.stringhandler.util;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;

@Component
public class Sorter {
    public String sort(final String str) {
        return Arrays.stream(str.split(""))
                .sorted() //AAAAABBBBBCCCCCC...aaaabbcc
                .sorted(String.CASE_INSENSITIVE_ORDER) // AAAAAaaaaBBBBBbbCCCCCCcc...
                .collect(Collectors.joining()); //
    }
}