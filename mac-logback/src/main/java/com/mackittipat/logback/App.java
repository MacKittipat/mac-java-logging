package com.mackittipat.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private final static Logger log = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) {
        log.debug("Hello World");
    }
}
