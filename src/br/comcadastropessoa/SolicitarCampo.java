package br.comcadastropessoa;

public interface SolicitarCampo<T> {

    T solicitar(String msgSolicitacao, Validador validador);
}
