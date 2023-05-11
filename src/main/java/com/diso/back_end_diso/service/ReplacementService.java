package com.diso.back_end_diso.service;

import com.diso.back_end_diso.interfaces.IReplacement;
import com.diso.back_end_diso.model.Replacement;
import com.diso.back_end_diso.repository.ReplacementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReplacementService implements IReplacement {

    @Autowired
    private ReplacementRepository replacementRepository;

    public Replacement save(Replacement replacement) {
        return replacementRepository.save(replacement);
    }

    @Override
    public List<Replacement> findAll() {
        return replacementRepository.findAll();
    }

    @Override
    public Optional<Replacement> findById(Long id) {

        return replacementRepository.findById(id);
    }

    @Override
    public Optional<Replacement> findAllByReceipt(String receipt) {
        return replacementRepository.findAllByReceipt(receipt);
    }

    @Override
    public void delete(Long id) {
        replacementRepository.deleteById(id);
    }

}
