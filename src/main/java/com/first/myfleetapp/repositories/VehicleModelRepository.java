package com.first.myfleetapp.repositories;

import com.first.myfleetapp.models.Client;
import com.first.myfleetapp.models.VehicleModel;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {
}
