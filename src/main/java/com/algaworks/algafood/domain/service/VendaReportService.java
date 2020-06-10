package com.algaworks.algafood.domain.service;

import com.algaworks.algafood.domain.filter.VendasDiariasFilter;

public interface VendaReportService {
    byte[] emitirVendasDiarias(VendasDiariasFilter filtro, String timeOffset);
}
