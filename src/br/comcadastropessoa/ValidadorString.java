package br.comcadastropessoa;

public class ValidadorString implements Validador{

    @Override
    public boolean isValido(String valor) {
        return valor != null && !valor.isEmpty();
    }
}