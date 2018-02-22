package br.comcadastropessoa;

import javax.swing.JOptionPane;

public class SolicitarString implements SolicitarCampo<String>{

    @Override
    public String solicitar(String msgSolicitacao, Validador validador) {
        boolean solicitaValor = true;
        String valor = null;
        do {
            valor = JOptionPane.showInputDialog(msgSolicitacao);
            if(!validador.isValido(valor)) {
                JOptionPane.showMessageDialog(null, "O valor digitado é inválido!");
                continue;
            } else {
                solicitaValor = false;
            }
        } while(solicitaValor);
        return valor;
    }
}