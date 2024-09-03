package org.example.LogAppender;

import org.example.LogMessage;

public interface LogAppender {
    void append(LogMessage logMessage);
}
