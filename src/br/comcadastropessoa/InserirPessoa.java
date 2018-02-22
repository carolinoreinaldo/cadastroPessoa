package br.comcadastropessoa;

public class InserirPessoa implements ExecutaAcao{

    public void executa(PessoaWapper pessoaWapper) {
        String nome;
        Integer idade = null;
 
        SolicitarCampo<String> solicitarNome = new SolicitarString();
        nome = solicitarNome.solicitar("Digite o nome da pessoa:", new ValidadorString());
        
        SolicitarCampo<Integer> solicitarIdade = new SolicitarInteger();
        idade = solicitarIdade.solicitar("Digite a sua idade", new ValidadorIdade());
        
        Pessoa novaPessoa = new Pessoa(1, nome, idade);
        pessoaWapper.add(novaPessoa);
    }
}