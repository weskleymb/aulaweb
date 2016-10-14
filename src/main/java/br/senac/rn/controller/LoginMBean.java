package br.senac.rn.controller;

import br.senac.rn.model.Usuario;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "login")
public class LoginMBean {
    
    private Usuario user = new Usuario();

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
    public String logar() {
        if (user.getLogin().equals("usuario") && user.getSenha().equals("123")) {
            return "sexo.html";
        }
        return null;
    }
    
}
