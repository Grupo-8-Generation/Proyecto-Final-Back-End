package com.coffe.Wehyah.Controller;
import com.coffe.Wehyah.Model.CartItems;
import com.coffe.Wehyah.Service.CARSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CarroCompras")
public class CarItems_Controller {
    @Autowired
    private CARSIMPL carsimpl;

    @GetMapping
    @RequestMapping(value = "consultarCarroCompras", method = RequestMethod.GET)
    public ResponseEntity<?> consultarCarroCompras() {
        List<CartItems> cartItemsList = this.carsimpl.consultarCarroCompras();
        return ResponseEntity.ok(cartItemsList);
    }

    @PutMapping
    @RequestMapping(value = "crearCarroCompras", method = RequestMethod.POST)
    public ResponseEntity<?> crearCarroCompras(@RequestBody CartItems cartItems) {
        CartItems carroComprasCrear=this.carsimpl.crearCarroCompras(cartItems);
        return ResponseEntity.status(HttpStatus.CREATED).body(carroComprasCrear);
    }

    @PutMapping
    @RequestMapping(value = "modificarCarroCompras", method = RequestMethod.PUT)
    public ResponseEntity<?> modificarCarroCompras(@RequestBody CartItems cartItems){
        CartItems carroComprasModificar=this.carsimpl.actualizarCarroCompras(cartItems);
        return ResponseEntity.status(HttpStatus.CREATED).body(carroComprasModificar);

    }

    @GetMapping
    @RequestMapping(value = "buscarCarroCompras{id}", method = RequestMethod.GET)
    public ResponseEntity<?> buscarCarroCompras(@PathVariable int id){
        CartItems cartItems=this.carsimpl.buscarCarroCompras(id);
        return ResponseEntity.ok(cartItems);
    }

    @DeleteMapping
    @RequestMapping(value = "eliminarCarroCompras/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarCarroCompras(@PathVariable int id){
        this.carsimpl.eliminarCarroCompras(id);
        return ResponseEntity.ok().build();
    }
}
