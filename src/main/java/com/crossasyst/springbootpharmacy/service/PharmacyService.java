package com.crossasyst.springbootpharmacy.service;

import com.crossasyst.springbootpharmacy.entity.PharmacyEntity;
import com.crossasyst.springbootpharmacy.model.PharmacyResponse;
import com.crossasyst.springbootpharmacy.repository.PharmacyRepository;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;


@Service
public class PharmacyService {

    private final PharmacyRepository pharmacyRepository;
    public PharmacyService(PharmacyRepository pharmacyRepository) {
        this.pharmacyRepository = pharmacyRepository;
    }

    public PharmacyResponse postPharmacyData(MultipartFile file) throws JAXBException, IOException {
        File tempFile = File.createTempFile("temp", null);
        file.transferTo(tempFile);

        JAXBContext jaxbContext = JAXBContext.newInstance(PharmacyEntity.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();


        PharmacyEntity pharmacy = (PharmacyEntity) unmarshaller.unmarshal(tempFile);
        pharmacyRepository.save(pharmacy);

        PharmacyResponse pharmacyResponse=new PharmacyResponse();
        pharmacyResponse.setNcpdpid(pharmacy.getNcpdpid());

        // Use for delete the temporary file after processing
        FileUtils.deleteQuietly(tempFile);

        return pharmacyResponse;

    }

}






