package org.example;

import org.example.LogAppender.ConsoleAppender;
import org.example.LogAppender.DataBaseLogAppender;

import java.util.Date;

public class Logger {
    private static Logger instance;
    private LoggerConfig loggerConfig;

    public static synchronized Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }
    private Logger(){
        loggerConfig = new LoggerConfig(LogLevel.INFO, new ConsoleAppender());
    }

    public void setLoggerConfig(LoggerConfig loggerConfig) {
        this.loggerConfig = loggerConfig;
    }

//    // Private constructor that takes a LoggerConfig
//    private Logger(LoggerConfig loggerConfig) {
//        this.loggerConfig = loggerConfig;
//    }

    // Synchronized method to get the instance, allowing custom LoggerConfig
//    public static synchronized Logger getInstance(LoggerConfig loggerConfig) {
//        if (instance == null) {
//            instance = new Logger(loggerConfig);
//        }
//        return instance;
//    }


    public void log(LogLevel logLevel, String message){
        LogMessage logMessage = new LogMessage(logLevel, message, new Date());
        loggerConfig.getLogAppender().append(logMessage);

    }

    public void info(String message) {
        log(LogLevel.INFO, message);
    }
    public void debug(String message) {
        log(LogLevel.DEBUG, message);
    }
    public void warning(String message) {
        log(LogLevel.WARNING, message);
    }
    public void error(String message){
        log(LogLevel.ERROR, message);
    }
    public void fatal(String message) {
        log(LogLevel.FATAL, message);
    }
}
