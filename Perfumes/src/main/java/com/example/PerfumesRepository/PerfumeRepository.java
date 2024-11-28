package com.example.PerfumesRepository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PerfumesModel.PerfumeModel;

@Repository
public interface PerfumeRepository extends JpaRepository<PerfumeModel,UUID>{

}
