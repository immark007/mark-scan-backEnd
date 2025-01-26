package com.mark.api.github.scan.dto;

import com.mark.api.github.scan.enums.StatusScan;
import com.mark.api.github.scan.enums.TipoScan;
public record ScanCreateDTO(
        String title,
        TipoScan tipo,
        StatusScan status,
        String image) {
}
