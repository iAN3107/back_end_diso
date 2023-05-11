package com.diso.back_end_diso.repository;

import com.diso.back_end_diso.model.Replacement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReplacementRepository extends JpaRepository<Replacement, Long> {
    public Optional<Replacement> findAllByReceipt(String receipt);
}
