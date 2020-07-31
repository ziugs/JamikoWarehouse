package ee.jamiko.warehouse.service;

import ee.jamiko.warehouse.model.Warehouse;
import ee.jamiko.warehouse.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseImplementation implements WarehouseService  {

    @Autowired
    WarehouseRepository warehouseRepository;


    @Override
    public List<Warehouse> findAll() {
        return warehouseRepository.findAll();
    }

    @Override
    public Warehouse save(Warehouse warehouse) {
        warehouseRepository.save(warehouse);
        return warehouse;
    }

    @Override
    public Warehouse findById(Long id) {
        return warehouseRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        Warehouse warehouse = findById(id);
        warehouseRepository.delete(warehouse);
    }



}
