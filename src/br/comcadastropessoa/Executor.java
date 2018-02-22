package br.comcadastropessoa;

import javax.swing.JOptionPane;

public class Executor {

    private static final PessoaWapper pessoaWapper = new PessoaWapper();
    private static final Object[] mainOptions = {"INSERIR","EDITAR","DELETAR","LISTAR","SAIR"};
    
    public static void main(String[] args) {
        
        boolean on = true;
        do {
            int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção",
                "Cadastro de Pessoa",
                JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, mainOptions, mainOptions[0]);
            
            ExecutaAcao executor = ExecutorsFactory.procuraExecutor(opcao);
            System.exit(0);
            executor.executa(pessoaWapper);
        } while(on);
    }
}
