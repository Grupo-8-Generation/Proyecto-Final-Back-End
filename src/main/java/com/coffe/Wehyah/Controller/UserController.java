package com.coffe.Wehyah.Controller;

import com.coffe.Wehyah.Model.Product;
import com.coffe.Wehyah.Model.User;
import com.coffe.Wehyah.Service.USIMPL;
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

    @GetMapping
    @RequestMapping(value = "consultarUsuario",method = RequestMethod.GET)
    public ResponseEntity<?> consultarUsuario(){
        List<User> usuarioList=this.usimpl.consultarUsuario();
        return ResponseEntity.ok(usuarioList);
    }
    @PostMapping
    @RequestMapping(value = "crearUsuario",method = RequestMethod.POST)
    public ResponseEntity<?> crearUsuario(@RequestBody User usuario){
        String mensaje = "";
        User usuarioCrear=this.usimpl.crearUsuario(usuario);
        mensaje = "El usuario " + usuarioCrear.getName() + " ha sido creado correctamente";
        return ResponseEntity.status(HttpStatus.CREATED).body(mensaje);
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
