package com.coffe.Wehyah.Controller;
import com.coffe.Wehyah.Model.Product;
import com.coffe.Wehyah.Service.PRSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Productos")
public class ProductController {
    @Autowired
    private PRSIMPL prsimpl;

    @GetMapping
    @RequestMapping(value = "consultarProducto",method = RequestMethod.GET)
    public ResponseEntity<?> consultarProducto(){
        List<Product>productList=this.prsimpl.consultarProducto();
        return ResponseEntity.ok(productList);
    }
    @PostMapping
    @RequestMapping(value = "crearProducto",method = RequestMethod.POST)
    public ResponseEntity<?> crearProducto(@RequestBody Product product){
        Product productoCrear=this.prsimpl.crearProducto(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(productoCrear);
    }
    @PutMapping
    @RequestMapping(value = "modificarProducto",method = RequestMethod.PUT)
    public ResponseEntity<?> modificarProducto(@RequestBody Product product){
        Product productModificar=this.prsimpl.actualizarProducto(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(productModificar);
    }
    @GetMapping
    @RequestMapping(value = "buscarProducto/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> buscarProducto(@PathVariable int id){
        Product product=this.prsimpl.buscarProducto(id);
        return ResponseEntity.ok(product);
    }
    @DeleteMapping
    @RequestMapping(value = "eliminarProducto/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarProducto(@PathVariable int id){
        this.prsimpl.eliminarProducto(id);
        return ResponseEntity.ok().build();
    }

}
