package com.mackittipat.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger log = LogManager.getLogger();

    public static void main( String[] args ) {
        log.debug("Hello World");
    }
}
