package br.com.allandonega;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {
    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class.getName());
    public HelloWorld(){};

    public static void main(String[] args) {
        escreveMensagem("Hello World");
    }

    static void escreveMensagem(String msg){
        System.out.println();
        LOGGER.log(Level.INFO, msg);
    }
}
