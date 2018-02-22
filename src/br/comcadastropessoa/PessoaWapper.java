package br.comcadastropessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PessoaWapper {

    private List<Pessoa> pessoas = new ArrayList<>();
    private Integer actualId = 0;
    
    void add(Pessoa pessoa){
        this.actualId += 1;
        pessoa.setId(actualId);
        this.pessoas.add(pessoa);
    }
    
    List<Pessoa> getPessoas() {
        return Collections.unmodifiableList(this.pessoas);
    }
    
    boolean delete(Integer id) {
        Pessoa pessoaParaDeletar = new Pessoa(id, "", 0);
        return this.pessoas.remove(pessoaParaDeletar);
    }
    
    String getListaPessoasToShow() {
        StringBuilder msg = new StringBuilder();
        for (Pessoa pessoa : pessoas) {
            msg.append("\nID : " + pessoa.getId());
            msg.append("\t      Nome: " + pessoa.getNome());
            msg.append("\t      Idade: " + pessoa.getIdade());
            msg.append("\n");
        }
        return msg.toString();
    }
}