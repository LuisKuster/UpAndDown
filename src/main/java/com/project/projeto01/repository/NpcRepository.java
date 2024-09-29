package com.project.projeto01.repository;

import com.project.projeto01.models.NpcModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NpcRepository extends JpaRepository<NpcModel,Integer> {
}
