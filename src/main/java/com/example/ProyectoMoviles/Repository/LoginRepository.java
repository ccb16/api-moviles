/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyectoMoviles.Repository;

import com.example.ProyectoMoviles.Model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LoginRepository extends JpaRepository<Login, Long>{
    public Login findByUsuarioAndContrasenia (String usuario, String password);
}
