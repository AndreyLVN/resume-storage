package com.urise.webapp.model;

import java.util.Objects;

/**
 * Created by vp on 23.05.17.
 */
public class TextSection extends Section {

    private final String content;

    public TextSection(String content) {
        Objects.requireNonNull(content, "content must not be null");
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TextSection that = (TextSection) o;

        return content.equals(that.content);
    }

    @Override
    public int hashCode() {
        return content.hashCode();
    }
}
