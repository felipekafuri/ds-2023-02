package com.emprestimo.dominio.repository;

import com.emprestimo.emprestimo.ItemDigital; // Importe a classe de entidade ItemDigital
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDigitalRepository extends JpaRepository<ItemDigital, Long> {

}
