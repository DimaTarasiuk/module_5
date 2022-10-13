package com.logger;

import java.io.IOException;
import java.util.logging.*;

public class HandlerEX {
    private static final Logger LOGGER = Logger.getLogger(HandlerEX.class.getName());

    public static void main(String[] args) {
        Handler consoleHandler = null;
        Handler fileHandler = null;

        try {
            consoleHandler = new ConsoleHandler();
            fileHandler = new FileHandler("./handler.log");


            LOGGER.addHandler(consoleHandler);
            LOGGER.addHandler(fileHandler);

            consoleHandler.setLevel(Level.ALL);
            fileHandler.setLevel(Level.ALL);
            LOGGER.setLevel(Level.ALL);

            LOGGER.removeHandler(consoleHandler);

            LOGGER.log(Level.FINE, "Finner logged");

        }catch (IOException e){
            LOGGER.log(Level.SEVERE, "Error occurred in file handler", e);
        }
    }
}
