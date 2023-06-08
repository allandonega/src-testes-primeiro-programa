package br.com.allandonega;

import br.com.utils.*;

import java.util.logging.Logger;

public class HelloWorld {
    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class.getName());
    static Utils utils = new Utils();

    public HelloWorld() {
    }

    public static void main(String[] args) {
        escreveMensagem("Hello World");
    }

    public static void escreveMensagem(String msg) {
        utils.log("Metodo: [ " + Thread.currentThread().getStackTrace()[0].getMethodName() + " ] "+ msg);
        utils.log("Metodo: [ " + Thread.currentThread().getStackTrace()[1].getMethodName() + " ] "+ msg);
        utils.log("Metodo: [ " + Thread.currentThread().getStackTrace()[2].getMethodName() + " ] "+ msg);
    }

}
