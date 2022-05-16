package com.steadyin.stringhandler.service;

import com.steadyin.stringhandler.dto.ParseRequest;
import com.steadyin.stringhandler.dto.ParseResponse;
import com.steadyin.stringhandler.util.UrlConnector;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParseService {
    private final UrlConnector urlConnector;
    public ParseResponse parse(ParseRequest request) {
        System.out.println(urlConnector.getHtml("https://naver.com"));
        return null;
    }
}