package br.comcadastropessoa;

import javax.swing.JOptionPane;

public class DeletarPessoa implements ExecutaAcao{

    public void executa(PessoaWapper pessoaWapper) {
        final String listaPessoasToShow = pessoaWapper.getListaPessoasToShow();
        final String msg = listaPessoasToShow + "\n\n Digite o Id Da pessoa para remover: ";
        final String id = JOptionPane.showInputDialog(msg);
        if(pessoaWapper.delete(Integer.valueOf(id))){
            JOptionPane.showMessageDialog(null, "Pessoa Removida com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Pessoa não encontrada");
        }
    }
}
