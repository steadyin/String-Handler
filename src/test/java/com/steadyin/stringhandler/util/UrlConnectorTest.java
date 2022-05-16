package com.steadyin.stringhandler.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class UrlConnectorTest {
    private final UrlConnector urlConnector = new UrlConnector();

    @DisplayName("url입력시 html을 가져올 수 있다.")
    @ParameterizedTest
    @CsvSource({"https://www.naver.com, <title>NAVER</title>", "https://www.google.com, <title>Google</title>"})
    void urlSuccessTest(final String url, final String title) {
        final String result = urlConnector.getHtml(url);

        assertThat(result.contains(title)).isTrue();
    }

    @DisplayName("잘못된 url입력시 IllegalArgumentException이 발생한다.")
    @ParameterizedTest
    @CsvSource({"https://www.naver.fail", "https://www.fail.fail"})
    void urlFaildTest(final String url) {
        assertThatThrownBy(() -> urlConnector.getHtml(url)).isInstanceOf(IllegalArgumentException.class).hasMessage("접근할 수 없는 url입니다.");
    }
}