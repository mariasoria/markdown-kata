package com.mariasoria;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Markdown {

    // Should enter -> [text](url)
    // Should return -> text [^anchor1] & [^anchor1] url
    public static String transform(String text) {

        String[] firstPart = text.split("\\[");
        String[] secondPart = firstPart[1].split("\\(");
        String textLink = firstPart[1].split("\\]")[0];
        String closingParentheses = "\\)";
        String textAfterUrl = secondPart[1].split(closingParentheses)[1];
        String urlText = secondPart[1].split(closingParentheses)[0];

        return textLink + " [^anchor1]" + textAfterUrl + "\n\n" + "[^anchor1]: " + urlText;
    }
}
