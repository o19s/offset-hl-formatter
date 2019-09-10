package com.o19s.labs;

import org.apache.lucene.search.highlight.Formatter;
import org.apache.lucene.search.highlight.TokenGroup;

public class SimpleOffsetFormatter implements Formatter {
    private static final String DEFAULT_PRE_TAG = "<b>";
    private static final String DEFAULT_POST_TAG = "</b>";

    private String preTag;
    private String postTag;

    public SimpleOffsetFormatter() {
        this(DEFAULT_PRE_TAG, DEFAULT_POST_TAG);
    }

    public SimpleOffsetFormatter(String preTag, String postTag) {
        this.preTag = preTag;
        this.postTag = postTag;
    }

    @Override
    public String highlightTerm(String matchedText, TokenGroup tokenGroup) {
        if (tokenGroup.getTotalScore() <= 0) {
            return matchedText;
        }

        // Allocate StringBuilder with the right number of characters from the
        // beginning, to avoid char[] allocations in the middle of appends.
        StringBuilder returnBuffer = new StringBuilder(preTag.length() + matchedText.length() + postTag.length());
        returnBuffer.append(preTag);
        returnBuffer.append(tokenGroup.getStartOffset());
        returnBuffer.append(matchedText);
        returnBuffer.append(postTag);
        return returnBuffer.toString();
    }
}
