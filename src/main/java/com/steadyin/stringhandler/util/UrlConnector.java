package com.steadyin.stringhandler.util;

import org.jsoup.Jsoup;

import java.io.IOException;

public class UrlConnector {

    public String getHtml(final String url) {
        try {
            return Jsoup.connect(url).get().html();
        } catch (IOException e) {
            throw new IllegalArgumentException("접근할 수 없는 url입니다.");
        }
    }
}