package com.emprestimo.emprestimo.service;

import com.emprestimo.emprestimo.ItemDigital;
import com.emprestimo.emprestimo.repository.ItemDigitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmprestimoService {

    private final ItemDigitalRepository itemDigitalRepository;

    @Autowired
    public EmprestimoService(ItemDigitalRepository itemDigitalRepository) {
        this.itemDigitalRepository = itemDigitalRepository;
    }

    public ItemDigital salvarItemDigital(ItemDigital itemDigital) {
        // Salva o item digital no banco de dados e retorna o item salvo
        return itemDigitalRepository.save(itemDigital);
    }

    // Outros métodos do serviço
}
