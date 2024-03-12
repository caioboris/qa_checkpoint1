package br.com.fiap;

public class LogCPF {

    public String log(boolean resultado){
        if(!resultado)
            return "Seu CPF é inválido para acesso ao sistema";
        return "Seu CPF é válido para acesso ao sistema";
    }
}
