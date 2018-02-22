package br.comcadastropessoa;

public class ValidadorIdade implements Validador{

    @Override
    public boolean isValido(String valor) {
        return valor != null && isValidNumber(valor); 
    }
        
    private static boolean isValidNumber(String idadeDigitada) {
        try{
            Integer.valueOf(idadeDigitada);
            return true;
        } catch( Exception e) {
            return false;
        }
    }
}