package com.example.demo.handler;

import org.springframework.lang.NonNull;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;

/**
 * Created by GYH on 2021/8/27
 */
public class StringBuilderWriter {
    private final String lineSeparator = java.security.AccessController.doPrivileged(
            new sun.security.action.GetPropertyAction("line.separator"));
    private final String wordSeparator = "\t\t";
    private final StringBuilder stringBuilder = new StringBuilder();

    /**
     * 添加一个换行
     *
     * @return {@code StringBuilderWriter}
     */
    public StringBuilderWriter newLine() {
        stringBuilder.append(lineSeparator);
        return this;
    }

    /**
     * 添加一个数据分隔空格
     *
     * @return {@code StringBuilderWriter}
     */
    public StringBuilderWriter newTab() {
        stringBuilder.append(wordSeparator);
        return this;
    }

    /**
     * 追加一个字符串
     *
     * @param str 要追加一个字符串
     * @return {@code StringBuilderWriter}
     */
    public StringBuilderWriter write(String str) {
        stringBuilder.append(str);
        return this;
    }

    /**
     * 追加一个字符串
     *
     * @param str 要追加一个字符串
     * @return {@code StringBuilderWriter}
     */
    public StringBuilderWriter write(String str, @NonNull String nullValue) {
        if (StringUtils.hasLength(str)) {
            stringBuilder.append(str);
        } else {
            stringBuilder.append(nullValue);
        }
        return this;
    }

    /**
     * 追加一个Double，如果double为null就追加0.0
     *
     * @param str 要追加一个Double
     * @return {@code StringBuilderWriter}
     */
    public StringBuilderWriter writeDouble(Double str) {
        if (str == null) {
            stringBuilder.append(0.0);
        } else {
            stringBuilder.append(str);
        }
        return this;
    }

    /**
     * 追加一个BigDecimal
     *
     * @param str 要追加一个BigDecimal
     * @return {@code StringBuilderWriter}
     */
    public StringBuilderWriter write(BigDecimal str) {
        stringBuilder.append(str);
        return this;
    }

    /**
     * 追加一个Integer
     *
     * @param str 要追加一个Integer
     * @return {@code StringBuilderWriter}
     */
    public StringBuilderWriter write(Integer str) {
        stringBuilder.append(str);
        return this;
    }

    public String getString() {
        return stringBuilder.toString();
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    /**
     * 清空stringBuild
     */
    public void clean() {
        stringBuilder.setLength(0);
        stringBuilder.trimToSize();
    }
}
