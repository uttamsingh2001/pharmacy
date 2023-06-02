package com.crossasyst.springbootpharmacy.repository;


import com.crossasyst.springbootpharmacy.entity.PharmacyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmacyRepository extends JpaRepository<PharmacyEntity,Long> {
}
