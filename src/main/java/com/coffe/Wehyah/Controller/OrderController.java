package com.coffe.Wehyah.Controller;

import com.coffe.Wehyah.Model.Order;
import com.coffe.Wehyah.Service.ORSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Ordenes")
public class OrderController {
    @Autowired
    private ORSIMPL orsimpl;

    @GetMapping
    @RequestMapping(value = "consultarOrden", method = RequestMethod.GET)
    public ResponseEntity<?> consultarOrden() {
        List<Order> orderList = this.orsimpl.consultarOrden();
        return ResponseEntity.ok(orderList);
    }

    @PutMapping
    @RequestMapping(value = "crearOrden", method = RequestMethod.POST)
    public ResponseEntity<?> crearOrden(@RequestBody Order order) {
        Order ordenCrear = this.orsimpl.crearOrden(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(ordenCrear);
    }

    @PutMapping
    @RequestMapping(value = "modificarOrden", method = RequestMethod.PUT)
    public ResponseEntity<?> modificarOrden(@RequestBody Order order){
        Order ordenModificar=this.orsimpl.modificarOrden(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(ordenModificar);
    }

    @PatchMapping("actualizarOrden/{id}")
    public ResponseEntity<?> actualizarOrden(@PathVariable int id){
        Order order=this.orsimpl.actualizarOrden(id);
        return ResponseEntity.ok(order);
    }

    @GetMapping
    @RequestMapping(value = "buscarOrden/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> buscarOrden(@PathVariable int id){
        Order order=this.orsimpl.buscarOrden(id);
        return ResponseEntity.ok(order);
    }

    @DeleteMapping
    @RequestMapping(value = "eliminarOrden/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarOrden(@PathVariable int id){
        this.orsimpl.eliminarOrden(id);
        return ResponseEntity.ok().build();
    }
}



