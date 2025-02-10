package com.OficinaDeSoftware.EmissorCertificadosBackend.domain;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "certificate")
public class Certificate {

    private Integer modelId;

    private String complement;

    private List<CertificateResposible> responsible;

}
