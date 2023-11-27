package com.example.LabsM.jpa;

import com.example.LabsM.jpa.model.AirplaneModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirplaneJpaRepository extends JpaRepository<AirplaneModel, Integer> {
}
