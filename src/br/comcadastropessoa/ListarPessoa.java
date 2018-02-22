package br.comcadastropessoa;

import javax.swing.JOptionPane;

public class ListarPessoa implements ExecutaAcao{

    public void executa(PessoaWapper pessoaWapper) {
        JOptionPane.showMessageDialog(null, pessoaWapper.getListaPessoasToShow());
    }
}