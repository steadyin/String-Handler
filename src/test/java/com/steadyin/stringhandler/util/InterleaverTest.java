package com.steadyin.stringhandler.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class InterleaverTest {

    private final Interleaver interleaver = new Interleaver();

    @DisplayName("문자열 두개가 주어질 때 하나의 교차하여 출력한다. 남은 것은 뒤에 붙인다.")
    @ParameterizedTest
    @CsvSource({
            "aaaaaaa, 1111, a1a1a1a1aaa",
            "AAbbbccDD, 3252, A3A2b5b2bccDD",
            "zzzAAfdsaf, 01239442789, z0z1z2A3A9f4d4s2a7f89"
    })
    void test(final String str1, final String str2, final String result) {
        assertThat(interleaver.interleave(str1, str2)).isEqualTo(result);
    }
}