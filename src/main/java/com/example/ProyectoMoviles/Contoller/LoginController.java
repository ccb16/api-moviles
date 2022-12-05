
package com.example.ProyectoMoviles.Contoller;

import com.example.ProyectoMoviles.Model.Login;
import com.example.ProyectoMoviles.Service.LoginService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/users")
public class LoginController {
    @Autowired
	private LoginService loginService;

	    @GetMapping
    public List<Login> findAll(){
        return loginService.findAll();
    }
     
    @PostMapping
    public Login add(@RequestBody Login car){
        return loginService.add(car);
    }
    
    @PutMapping("/{id}")
    public Login update(@PathVariable long id, @RequestBody Login log){
        log.setid_login(id);
        return loginService.update(log);
    }
	
	@DeleteMapping("/login/{id}")
	public void eliminar(Long id) {
		loginService.delete(id);
	}
    @GetMapping("/{usuario}/{contrasenia}")
    public ResponseEntity<?>  obtener(@PathVariable String usuario,@PathVariable String contrasenia ){	
        
            
      try{
           Login log = loginService.listarLoginUser(usuario,contrasenia);
           if(log==null)
           {
               return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontro usuario");
           }
               
            return ResponseEntity.status(HttpStatus.OK).body(loginService.listarLoginUser(usuario,contrasenia));
        }catch (Exception e){
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"Error\"*:\"Error. Por favor intente mas tarde.\"}");
        }
    }
}
