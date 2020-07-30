package ee.jamiko.warehouse.controller;


import ee.jamiko.warehouse.model.Warehouse;
import ee.jamiko.warehouse.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/")
public class WarehouseController {

    @Autowired
    WarehouseService warehouseService;

    @GetMapping("/warehouse")
    public ResponseEntity<List<Warehouse>> get() {
        List<Warehouse> warehouses = warehouseService.findAll();
        return new ResponseEntity<List<Warehouse>>(warehouses, HttpStatus.OK);
    }

    @PostMapping("/warehouse")
    public ResponseEntity<Warehouse> save(@RequestBody Warehouse warehouse) {
        Warehouse warehouseProduct = warehouseService.save(warehouse);
        return new ResponseEntity<Warehouse>(warehouseProduct, HttpStatus.OK);
    }

    @GetMapping("/warehouse/{id}")
    public ResponseEntity<Warehouse> get(@PathVariable("id") Long id) {
        Warehouse warehouseProduct = warehouseService.findById(id);
        return new ResponseEntity<Warehouse>(warehouseProduct, HttpStatus.OK);
    }

    @DeleteMapping("/warehouse/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        warehouseService.delete(id);
        return new ResponseEntity<String>("Warehouse product deleted successfully", HttpStatus.OK);
    }

}
