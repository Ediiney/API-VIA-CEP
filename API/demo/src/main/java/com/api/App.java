package com.api;

import java.io.IOException;

import com.service.APIServico;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        APIServico  apiServico = new APIServico();
       
        try {
            System.out.println(apiServico.getEndereco("04413040"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }
}
