package com.coffe.Wehyah.Controller;
import com.coffe.Wehyah.Model.OrderDetail;
import com.coffe.Wehyah.Service.OR_DET_SIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/detalleOrdenes")
public class OrderDetail_Controller {
    @Autowired
    private OR_DET_SIMPL or_det_simpl;

    @GetMapping
    @RequestMapping(value = "consultarDetalleDeOrden", method = RequestMethod.GET)
    public ResponseEntity<?> consultarDetalleDeOrden() {
        List<OrderDetail> orderDetailList = this.or_det_simpl.consultarDetalleDeOrden();
        return ResponseEntity.ok(orderDetailList);
    }

    @PutMapping
    @RequestMapping(value = "crearDetalleDeOrden(", method = RequestMethod.POST)
    public ResponseEntity<?> crearDetalleDeOrden(@RequestBody OrderDetail orderDetail){
        OrderDetail detalleDeOrdenCrear= this.or_det_simpl.crearDetalleDeOrden(orderDetail);
        return ResponseEntity.status(HttpStatus.CREATED).body(detalleDeOrdenCrear);
    }

    @PutMapping
    @RequestMapping(value = "modificarDetalleDeOrden", method = RequestMethod.PUT)
    public ResponseEntity<?> modificarDetalleDeOrden(@RequestBody OrderDetail orderDetail){
        OrderDetail detalleDeOrdenModificar=this.or_det_simpl.actualizarDetalleDeOrden(orderDetail);
        return ResponseEntity.status(HttpStatus.CREATED).body(detalleDeOrdenModificar);
    }

    @GetMapping
    @RequestMapping(value = "buscarDetalleDeOrden/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> buscarDetalleDeOrden(@PathVariable int id){
        OrderDetail orderDetail=this.or_det_simpl.buscarDetalleDeOrden(id);
        return ResponseEntity.ok(orderDetail);
    }

    @DeleteMapping
    @RequestMapping(value = "eliminarDetalleDeOrden/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarDetalleDeOrden(@PathVariable int id){
        this.or_det_simpl.eliminarDetalleDeOrden(id);
        return ResponseEntity.ok().build();
    }
}
