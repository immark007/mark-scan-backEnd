package com.mark.api.github.scan.controllers;

import com.mark.api.github.scan.dto.ScanCreateDTO;
import com.mark.api.github.scan.services.ScanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/scans")
public class ScanController {
    @Autowired
    private ScanService scanService;

    public ScanController(ScanService scanService) {
        this.scanService = scanService;
    }

    @PostMapping
    public ResponseEntity<?> createScan(@RequestBody ScanCreateDTO scanCreateDTO) {
        String savedTitle = scanService.createScan(scanCreateDTO);
        return ResponseEntity.ok("Scan criado com sucesso: " + savedTitle);
    }
}

