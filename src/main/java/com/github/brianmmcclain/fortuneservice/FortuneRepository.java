package com.github.brianmmcclain.fortuneservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FortuneRepository extends JpaRepository<Fortune, Long> {
    
}