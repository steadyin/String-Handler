package com.steadyin.stringhandler.util;

import com.steadyin.stringhandler.error.UrlConnectionException;
import lombok.extern.apachecommons.CommonsLog;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class UrlConnector {
    public String getHtml(final String url) {
        try {
            return Jsoup.connect(url).get().html();
        } catch (IOException e) {
            throw new UrlConnectionException("접근할 수 없는 url입니다.");
        }
    }
}