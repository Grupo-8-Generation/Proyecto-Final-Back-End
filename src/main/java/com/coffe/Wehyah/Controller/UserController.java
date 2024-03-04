package com.coffe.Wehyah.Controller;

import com.coffe.Wehyah.Model.Product;
import com.coffe.Wehyah.Model.User;
import com.coffe.Wehyah.Model.UserLoginRequest;
import com.coffe.Wehyah.Service.USIMPL;
import com.coffe.Wehyah.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Usuarios")
public class UserController {
    @Autowired
    private USIMPL usimpl;

    @Autowired
    private UserService userService;


    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody UserLoginRequest loginRequest) {
        User user = userService.authenticateUser(loginRequest.getUsername(), loginRequest.getPassword());
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    @GetMapping
    @RequestMapping(value = "consultarUsuario",method = RequestMethod.GET)
    public ResponseEntity<?> consultarUsuario(){
        List<User> usuarioList=this.usimpl.consultarUsuario();
        return ResponseEntity.ok(usuarioList);
    }

    @PutMapping
    @RequestMapping(value = "crearUsuario",method = RequestMethod.POST)
    public ResponseEntity<?> crearUsuario(@RequestBody User usuario){
        User usuarioCrear=this.usimpl.crearUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioCrear);
    }
    @PutMapping
    @RequestMapping(value = "modificarUsuario",method = RequestMethod.PUT)
    public ResponseEntity<?> modificarUsuario(@RequestBody User usuario){
        User userModificar=this.usimpl.actualizarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(userModificar);
    }

    @GetMapping
    @RequestMapping(value = "buscarUsuario/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> buscarUsuario(@PathVariable int id){
        User usuario=this.usimpl.buscarUsuario(id);
        return ResponseEntity.ok(usuario);
    }
    @DeleteMapping
    @RequestMapping(value = "eliminarUsuario/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarUsuario(@PathVariable int id){
        this.usimpl.eliminarUsuario(id);
        return ResponseEntity.ok().build();
    }


}
