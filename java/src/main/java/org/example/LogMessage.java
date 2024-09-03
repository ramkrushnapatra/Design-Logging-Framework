package org.example;

import java.util.Date;

public class LogMessage {
    private LogLevel logLevel;
    private String logMessage;
    private Date timestamp;

    public LogMessage(LogLevel logLevel, String logMessage, Date timestamp) {
        this.logLevel = logLevel;
        this.logMessage = logMessage;
        this.timestamp = timestamp;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public String getLogMessage() {
        return logMessage;
    }

    public void setLogMessage(String logMessage) {
        this.logMessage = logMessage;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "LogMessage{" +
                "logLevel=" + logLevel +
                ", logMessage='" + logMessage + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
