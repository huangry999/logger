package com.log.uiapi.service.bean;

import com.log.fileservice.grpc.LineText;

import java.util.Comparator;

public class LogLineText implements Comparator<LogLineText> {
    private long lineNo;
    private String text;

    public LogLineText(LineText src) {
        this(src.getLineNo(), src.getText());
    }

    public LogLineText(long lineNo, String text) {
        this.lineNo = lineNo;
        this.text = text;
    }

    public long getLineNo() {
        return lineNo;
    }

    public String getText() {
        return text;
    }

    @Override
    public int compare(LogLineText o1, LogLineText o2) {
        return (int) (o1.lineNo - o2.lineNo);
    }

    @Override
    public String toString() {
        return "LogLineText{" +
                "lineNo=" + lineNo +
                ", text='" + text + '\'' +
                '}';
    }
}
