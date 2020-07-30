package ee.jamiko.warehouse.repository;

import ee.jamiko.warehouse.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseRepository extends JpaRepository <Warehouse, Long> {
}
