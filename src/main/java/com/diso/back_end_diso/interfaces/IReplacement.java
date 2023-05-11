package com.diso.back_end_diso.interfaces;

import com.diso.back_end_diso.model.Replacement;

import java.util.List;
import java.util.Optional;

public interface IReplacement {

    public Replacement save(Replacement replacement);

    public List<Replacement> findAll();

    public Optional<Replacement> findById(Long id);

    public Optional<Replacement> findAllByReceipt(String receipt);

    public void delete(Long id);

}
