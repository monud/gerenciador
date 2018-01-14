package br.com.alura.gerenciador.web;

import javax.servlet.http.Cookie;

@Deprecated
/*Classe substituida, ao invés de se utilizar os cookies , agora se utiliza das Sessions */

public class Cookies {

	private final Cookie[] cookies;

	public Cookies(Cookie[] cookies) {
		this.cookies = cookies;
	}

	public Cookie buscaUsuarioLogado() {
		if(cookies ==null) return null;
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals("usuario.logado")) {
				return cookie;
			}
		}
		return null;
	}

}
