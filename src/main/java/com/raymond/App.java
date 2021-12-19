package com.raymond;

import com.raymond.facade.CheckFacade;

public class App {

    public static void main(String[] args) {

        CheckFacade cliente1 = new CheckFacade();
        cliente1.buscar("02/07/2022", "08/07/2022", "Medellín", "Buenos Aires");
    }


}
