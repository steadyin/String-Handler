package com.steadyin.stringhandler.service;

import com.steadyin.stringhandler.dto.ParseRequest;
import com.steadyin.stringhandler.dto.ParseResponse;
import com.steadyin.stringhandler.util.Arranger;
import com.steadyin.stringhandler.util.Separator;
import com.steadyin.stringhandler.util.UrlConnector;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParseService {

    private final UrlConnector urlConnector;

    private final Arranger arranger;

    public ParseResponse parse(ParseRequest request) {
        final String html = urlConnector.getHtml(request.getUrl());
        final String exposedHtml = request.getExposureType().getExposedHtml(html);
        final Arranger rearrange = arranger.rearrange(exposedHtml);

        return null;
    }
}