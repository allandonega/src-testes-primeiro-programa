package br.com.allandonega;

import br.com.utils.*;

import java.util.logging.Logger;

public class HelloWorld {
    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class.getName());

    public HelloWorld() {
    }

    static Utils utils = new Utils();

    public static void main(String[] args) {
        escreveMensagem("Hello World");
    }

    public static void escreveMensagem(String msg) {
        System.out.println();
        utils.log(msg);
    }

}
