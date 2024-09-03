package org.example;

import org.example.LogAppender.ConsoleAppender;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


//        LoggerConfig customConfig = new LoggerConfig(LogLevel.DEBUG, new DataBaseLogAppender());
//        Logger logger = Logger.getInstance(customConfig);
//        logger.debug("This is a debug message.");
        Logger logger = Logger.getInstance();
        LoggerConfig loggerConfig = new LoggerConfig(LogLevel.ERROR, new ConsoleAppender());
        logger.setLoggerConfig(loggerConfig);
        logger.error("error logger");

        LoggerConfig loggerConfig2 = new LoggerConfig(LogLevel.ERROR, new ConsoleAppender());
        logger.setLoggerConfig(loggerConfig2);
        logger.info("info logger");

    }
}