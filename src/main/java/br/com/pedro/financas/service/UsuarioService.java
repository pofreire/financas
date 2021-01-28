package br.com.pedro.financas.service;

import br.com.pedro.financas.model.Usuario;

public interface UsuarioService {

	Usuario autenticar(String email, String senha);

	Usuario salvar(Usuario usuario);

	void validarEmail(String email);


}
