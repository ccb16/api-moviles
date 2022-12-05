package com.example.ProyectoMoviles.Model;

import javax.persistence.Column;
import javax.persistence.Entity;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@Entity
@Table(name = "login")
public class Login implements Serializable {

    private static final Long serialVersionUID = 1L;
    @Id
    @Column

    private long id_login;
    @Column
    private String usuario;
    @Column
    private String contrasenia;

    public Login() {
        super();
    }

    public Login(Long id_login, String usuario, String contrasenia) {
        super();
        this.id_login = id_login;
        this.usuario = usuario;
        this.contrasenia = contrasenia;

    }
    public Long getid_login() {
		return id_login;
	}
	public void setid_login(Long id_login) {
		this.id_login = id_login;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
    
}
