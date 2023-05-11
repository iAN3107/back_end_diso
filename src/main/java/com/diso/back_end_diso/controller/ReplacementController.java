package com.diso.back_end_diso.controller;

import com.diso.back_end_diso.exception.ReplacementNotFoundException;
import com.diso.back_end_diso.interfaces.IReplacement;
import com.diso.back_end_diso.model.Replacement;
import com.diso.back_end_diso.service.ReplacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ReplacementController{

    @Autowired
    ReplacementService replacementService;

    @PostMapping("/replacement")
    public Replacement save(@RequestBody Replacement replacement) {

//        Optional<Replacement> replacementOptional = findAllByReceipt(replacement.getReceipt());
//        if(replacementOptional.isPresent())
//            throw new ReplacemantReceiptAlreadyExistsException
//                    ("The Receipt " + replacement.getReceipt() + " already exists!");

        return replacementService.save(replacement);
    }

    @GetMapping("/replacement")
    public List<Replacement> findAll(){
        return replacementService.findAll();
    }

    @GetMapping("/replacement/{id}")
    public Replacement findById(@PathVariable Long id) {
        Optional<Replacement> replacementOptional = replacementService.findById(id);
        if (replacementOptional.isEmpty()) throw new
                ReplacementNotFoundException("Replacement with ID: " + id +" doesnt exists!");

        return replacementOptional.get();
    }

//    public Optional<Replacement> findAllByReceipt(String receipt) {
//        return replacementService.findAllByReceipt(receipt);
//    }

    @DeleteMapping("/replacement/{id}")
    public String delete(@PathVariable Long id) {
        Optional<Replacement> replacementOptional = replacementService.findById(id);
        if (replacementOptional.isEmpty()) throw new
                ReplacementNotFoundException("Replacement with ID: " + id +" doesnt exists!");

        replacementService.delete(id);
        return("Replacement ID: " + id + " has been deleted!");
    }

}
