package com.emprestimo.emprestimo;

import com.emprestimo.emprestimo.service.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emprestimos")
public class
EmprestimoController {

    private final EmprestimoService emprestimoService;

    @Autowired
    public EmprestimoController(EmprestimoService emprestimoService) {
        this.emprestimoService = emprestimoService;
    }

    @PostMapping("/item")
    public ResponseEntity<ItemDigital> salvarItemDigital(@RequestBody ItemDigital itemDigital) {
        ItemDigital salvo = emprestimoService.salvarItemDigital(itemDigital);
        return ResponseEntity.ok(salvo);
    }

    // Outros endpoints conforme necessário
}
