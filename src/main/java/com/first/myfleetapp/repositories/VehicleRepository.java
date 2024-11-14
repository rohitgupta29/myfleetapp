package com.first.myfleetapp.repositories;

import com.first.myfleetapp.models.Client;
import com.first.myfleetapp.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}