package com.steadyin.stringhandler.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SorterTest {
    private final Sorter sorter = new Sorter();

    @ParameterizedTest
    @DisplayName("영어를 정렬할 때 AaBb 순으로 오른차순 정렬한다.")
    @CsvSource({"fdfdsfasfsdfTEStsstfasasaszA,AaaaadddEffffffSssssssssTttz"})
    void englishSortTest(String org, String target) {
        final String result = sorter.sort(org);

        assertThat(result).isEqualTo(target);
    }

    @Test
    @DisplayName("숫자를 정렬할 때 0~9 순으로 오름차순으로 정렬한다.")
    void numberSortTest() {
        final String result = sorter.sort("78272844709124");

        assertThat(result).isEqualTo("01222444777889");
    }
}