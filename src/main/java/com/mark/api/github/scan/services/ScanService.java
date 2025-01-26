package com.mark.api.github.scan.services;


import com.mark.api.github.scan.dto.ScanCreateDTO;
import com.mark.api.github.scan.entity.Scan;
import com.mark.api.github.scan.repositories.ScanRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScanService {
    @Autowired
    private ScanRepository scanRepository;

    @Transactional
    public String createScan(ScanCreateDTO scanCreateDTO) {
        var scan = new Scan(scanCreateDTO.title(),scanCreateDTO.tipo(),scanCreateDTO.status(),scanCreateDTO.image());
        var scanSaved = scanRepository.save(scan);
        return scanSaved.getTitle();
    }
}
