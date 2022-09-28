package com.entra21.primeiroprojetospring.view.repository;


import com.entra21.primeiroprojetospring.model.entity.DvdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DvdRepository extends JpaRepository<DvdEntity, Long> {
}
