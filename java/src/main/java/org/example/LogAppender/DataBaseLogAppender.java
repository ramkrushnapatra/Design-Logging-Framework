package org.example.LogAppender;

import org.example.LogMessage;

public class DataBaseLogAppender implements LogAppender{
    private final String jdbcUrl;
    private final String userName;
    private final String password;

    public DataBaseLogAppender(String jdbcUrl, String userName, String password) {
        this.jdbcUrl = jdbcUrl;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public void append(LogMessage logMessage) {

    }
}
