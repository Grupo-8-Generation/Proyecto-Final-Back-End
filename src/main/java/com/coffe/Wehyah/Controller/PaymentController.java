package com.coffe.Wehyah.Controller;

import com.coffe.Wehyah.Model.CartItems;
import com.coffe.Wehyah.Model.Payment;
import com.coffe.Wehyah.Service.CARSIMPL;
import com.coffe.Wehyah.Service.PAGSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Pagos")
public class PaymentController {
    @Autowired
    private PAGSIMPL pagsimpl;

    @GetMapping
    @RequestMapping(value = "consultarPagos", method = RequestMethod.GET)
    public ResponseEntity<?> consultarPagos() {
        List<Payment> paymentList = this.pagsimpl.consultarPagos();
        return ResponseEntity.ok(paymentList);
    }

    @PostMapping
    @RequestMapping(value = "crearPagos", method = RequestMethod.POST)
    public ResponseEntity<?> crearPagos(@RequestBody Payment payment) {
        Payment crearPagosCrear=this.pagsimpl.crearPagos(payment);
        return ResponseEntity.status(HttpStatus.CREATED).body(crearPagosCrear);
    }

    @PutMapping
    @RequestMapping(value = "modificarPagos", method = RequestMethod.PUT)
    public ResponseEntity<?> modificarPagos(@RequestBody Payment payment){
        Payment modificarPagos=this.pagsimpl.actualizarPagos(payment);
        return ResponseEntity.status(HttpStatus.CREATED).body(modificarPagos);
    }

    @GetMapping
    @RequestMapping(value = "buscarPagos/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> buscarPagos(@PathVariable int id){
        Payment payment=this.pagsimpl.buscarPagos(id);
        return ResponseEntity.ok(payment);
    }

    @DeleteMapping
    @RequestMapping(value = "eliminarPagos/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarPagos(@PathVariable int id){
        this.pagsimpl.eliminarPagos(id);
        return ResponseEntity.ok().build();
    }
}
