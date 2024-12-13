package com.first.myfleetapp.repositories;

import com.first.myfleetapp.models.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {
}
