package ee.jamiko.warehouse.service;

import ee.jamiko.warehouse.model.Warehouse;

import java.util.List;

public interface WarehouseService {

    List<Warehouse> findAll();

    Warehouse save(Warehouse warehouse);

    Warehouse findById(Long id);

    void delete(Long id);

}
