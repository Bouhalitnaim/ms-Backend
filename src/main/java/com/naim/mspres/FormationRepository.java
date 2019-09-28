package com.naim.mspres;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//@CrossOrigin("*")
@RepositoryRestResource
public interface FormationRepository extends JpaRepository<Formation,Long> {
}
