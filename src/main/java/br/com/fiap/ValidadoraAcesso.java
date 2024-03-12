package br.com.fiap;

import java.util.ArrayList;

public class ValidadoraAcesso {

    ArrayList cpfsValidos = new ArrayList<String>();

    public boolean validaAcesso(String cpf){
        cpfsValidos.add("75799939026");
        cpfsValidos.add("13761465092");
        cpfsValidos.add("03022301065");
        cpfsValidos.add("12138242064");
        cpfsValidos.add("91270933019");

        return cpfsValidos.contains(cpf);
    }

}
