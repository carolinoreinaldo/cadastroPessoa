package br.comcadastropessoa;

import javax.swing.JOptionPane;

public class SolicitarInteger implements SolicitarCampo<Integer>{

    @Override
    public Integer solicitar(String msgSolicitacao, Validador validador) {
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
        return Integer.valueOf(valor);
    }
}