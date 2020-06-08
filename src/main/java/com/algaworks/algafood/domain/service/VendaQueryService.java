package com.algaworks.algafood.domain.service;

import com.algaworks.algafood.domain.filter.VendasDiariasFilter;
import com.algaworks.algafood.domain.model.dto.VendaDiaria;

import java.util.List;

public interface VendaQueryService {

    List<VendaDiaria> consultarVendasDiarias(VendasDiariasFilter filtro);
}
