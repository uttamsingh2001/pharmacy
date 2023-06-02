package com.crossasyst.springbootpharmacy.controller;
import com.crossasyst.springbootpharmacy.entity.PharmacyEntity;
import com.crossasyst.springbootpharmacy.model.PharmacyResponse;
import com.crossasyst.springbootpharmacy.repository.PharmacyRepository;
import com.crossasyst.springbootpharmacy.service.PharmacyService;
import jakarta.xml.bind.JAXBException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/v1")
public class PharmacyController {
    private final PharmacyService pharmacyService;

    public PharmacyController(PharmacyService pharmacyService) {
        this.pharmacyService = pharmacyService;
    }

    @PostMapping("/pharmacy")
    public ResponseEntity<PharmacyResponse> postPharmacyData(@RequestParam("File") MultipartFile file) throws JAXBException, IOException {
        PharmacyResponse pharmacyResponse=pharmacyService.postPharmacyData(file);
        return new ResponseEntity<>(pharmacyResponse,HttpStatus.CREATED);

    }
}


