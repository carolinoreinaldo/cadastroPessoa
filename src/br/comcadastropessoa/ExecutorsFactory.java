package br.comcadastropessoa;

class ExecutorsFactory {

    private static final Integer INSERIR = 0;
    private static final Integer EDITAR = 1;
    private static final Integer DELETAR = 2;
    private static final Integer LISTAR = 3;
    
    static ExecutaAcao procuraExecutor(Integer opcao) {
        if(INSERIR==opcao){
            return new InserirPessoa();
        } else if (EDITAR == opcao) {
            return null;
        } else if (DELETAR==opcao) {
            return new DeletarPessoa();
        } else if (LISTAR==opcao){
            return new ListarPessoa();
        } else {
            System.exit(0);
        }
        return null;
    }
}