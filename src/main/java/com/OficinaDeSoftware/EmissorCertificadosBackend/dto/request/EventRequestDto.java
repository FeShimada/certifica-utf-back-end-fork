package com.OficinaDeSoftware.EmissorCertificadosBackend.dto.request;

import com.OficinaDeSoftware.EmissorCertificadosBackend.dto.CertificateDto;
import com.OficinaDeSoftware.EmissorCertificadosBackend.dto.DateEventDto;
import com.OficinaDeSoftware.EmissorCertificadosBackend.dto.LocalDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class EventRequestDto {

        private String name;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
        private LocalDate startDate;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
        private LocalDate endDate;

        private List<DateEventDto> dates;

        private CertificateDto certificate;

        private String backgroundUrl;

        private Integer workload;

        private String description;

        private LocalDto location;

        private String nrUuidResponsible;

}
