package com.steadyin.stringhandler.util;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class Separator {
    private final Pattern PATTERN = Pattern.compile("([A-Za-z]*)([0-9]*)");

    @Getter
    private String english;

    @Getter
    private String number;

    public Separator separate(final String str) {
        final Matcher matcher = PATTERN.matcher(str);

        StringBuilder sbStr = new StringBuilder();
        StringBuilder sbNUm = new StringBuilder();

        while (matcher.find()) {
            sbStr.append(matcher.group(1));
            sbNUm.append(matcher.group(2));
        }

        this.english = sbStr.toString();
        this.number = sbNUm.toString();
        return this;
    }
}