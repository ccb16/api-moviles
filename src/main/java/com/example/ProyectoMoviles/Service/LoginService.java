/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyectoMoviles.Service;

import com.example.ProyectoMoviles.Model.Login;
import java.util.List;

public interface LoginService {
 	    //Funcion para mostrar todos los datos
    public List<Login> findAll();
    public Login listarLoginUser(String usuario,String contrasenia);
    //Funcion para agregar datos
    public Login add(Login log);
    
    //Funcion para modificar datos
    public Login update(Login log);
	
	public void delete(Long id);

}