package com.mark.api.github.scan.repositories;

import com.mark.api.github.scan.entity.Scan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScanRepository extends JpaRepository<Scan, Integer> {
}
