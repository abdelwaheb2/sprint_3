package com.abdelwaheb.examens.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abdelwaheb.examens.entities.Matiere;

public interface MatiereRepository extends JpaRepository<Matiere, Long> {

}
