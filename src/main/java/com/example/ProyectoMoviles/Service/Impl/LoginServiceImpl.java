/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyectoMoviles.Service.Impl;

import com.example.ProyectoMoviles.Model.Login;
import com.example.ProyectoMoviles.Repository.LoginRepository;
import com.example.ProyectoMoviles.Service.LoginService;
import com.example.ProyectoMoviles.Service.LoginService;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public List<Login> findAll() {
        return loginRepository.findAll();
    }

    @Override
    public Login add(Login log) {
        return loginRepository.save(log);
    }

    @Override
    public Login update(Login cli) {
        Login objlogin = loginRepository.getById(cli.getid_login());
        BeanUtils.copyProperties(cli, objlogin);
        return loginRepository.save(objlogin);
    }

    @Override
    public void delete(Long id) {
        loginRepository.deleteById(id);

    }

    @Override
    public Login listarLoginUser(String usuario, String contrasenia) {
        return loginRepository.findByUsuarioAndContrasenia(usuario,contrasenia);
    }



  

}
